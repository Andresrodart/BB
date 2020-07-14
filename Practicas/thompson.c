#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>
#include "Infix2Posfix.h" // infixToPostfix and isGrouping
#include "thompson.h"

struct Thompson * readReGex(char * regex, int * len){
    //We do not check is len inside the regex lenght because the last letter we will read is a Literal and literals never call readReGex again
	char x = regex[--(*len)];
    if (isalpha(x))
        return makeLiteral(charToString(x));
    else if(x == '.')
        return makeConcatenation(regex, len);
    else if (x == '|')
        return makeAlternation(regex, len);
    else if (x == '+')
        return makeAdd(regex, len);
    else if (x == '*')
        return makeKleene(regex, len);
	else
		__errorHandler(0, charToString(x));
}

struct Thompson * makeGraph(char * __regex){
	char * Regex = (char *) malloc(strlen(__regex) * sizeof(char));
	struct Thompson * graph;
	int len;

	strcpy(Regex, __regex);
	if(!hasConcatSym(Regex))
		Regex = addConcatSym(Regex);
	
	infixToPostfix(Regex);
	len = strlen(Regex);
	graph = readReGex(Regex, &len);
	free(Regex);
	return graph;
}

struct Thompson * makeNode(int n){
    struct Thompson * res = (struct Thompson *) malloc(sizeof(struct Thompson));
    res->n = n;
    res->id = UINT_MAX;
    res->visited = False;
    res->final = (n != 0)? False:True;
    res->desc  = (n != 0)? (char * *) malloc(n * sizeof(char *)):NULL;
    res->nodes = (n != 0)? (struct Thompson * *) malloc(n * sizeof(struct Thompson *)):NULL;
    return res;
}

struct Thompson * makeLiteral(char * x){
    struct Thompson * res = makeNode(1);
	res->desc[0] = x;
    res->nodes[0] = makeNode(0);
    return res;
}

struct Thompson * makeConcatenation(char * regex, int * len){
    struct Thompson * resL, * resR;
    resR = readReGex(regex, len);
    resL = readReGex(regex, len);
    //To this node they may be already one or two pointer to it, so we have to keep direcction but change info
    copyStruct(getFinal(resL), resR);
    return resL;
}

struct Thompson * makeAlternation(char * regex, int * len){
    struct Thompson * res, * end;
    res = makeNode(2);
    end = makeLiteral(epsilonDot);
    res->desc[0] = epsilonDot; 
    res->desc[1] = epsilonDot; 
    res->nodes[0] = readReGex(regex, len); 
    res->nodes[1] = readReGex(regex, len); 
    
	for(int i = 0; i < res->n; i++)
        copyStruct(getFinal(res->nodes[i]), end);
    
    return res; 
}

struct Thompson * makeKleene(char * regex, int * len){
    struct Thompson * res, * end;
    res = makeNode(2);
    end = makeNode(2);
    
    res->desc[0] = epsilonDot; 
    res->desc[1] = epsilonDot; 
    end->desc[0] = epsilonDot; 
    end->desc[1] = epsilonDot; 
    
    res->nodes[0] = readReGex(regex, len); 
    end->nodes[0] = makeNode(0);
    
    end->nodes[1] = res->nodes[0]; 
    res->nodes[1] = end->nodes[0];
    
    //To this node they may be already one or two pointer to it, so we have to keep direction but change info
   	copyStruct(getFinal(res), end);
    
    return res;
}

struct Thompson * makeAdd(char * regex, int * len){
    struct Thompson * res, * end;
    res = makeLiteral(epsilonDot);
    end = makeNode(2);
     
    end->desc[0] = epsilonDot; 
    end->desc[1] = epsilonDot; 
    
    res->nodes[0] = readReGex(regex, len); 
    end->nodes[0] = makeNode(0);
    
	end->nodes[1] = res->nodes[0]; 
    //To this node they may be already one or two pointer to it, so we have to keep direction but change info
    copyStruct(getFinal(res), end);
	
	return res;
}

void giveId(struct Thompson * q, int * serial){
    if (q->id == UINT_MAX)
        q->id = (int) (*serial)++;
    for (int i = 0; i < q->n; i++)
		if (q->nodes[i]->id > q->id)
            giveId(q->nodes[i], serial);
}

int makeString(struct Thompson * q, char * * output){
    if(q->n == 0 || q->final)
		return 0;
    
	int len = 2*strlen(*output) + 4*strlen(transitionDot) + 2*strlen(epsilonDot);
	char * aux = (char *) malloc(len * sizeof(char));
	char * tmp = (char *) calloc(len, sizeof(char));
	strcpy(aux, *output);

	if (!aux) perror("No spaces for string");
	for (int i = 0; i < q->n; i++){
		sprintf(tmp, transitionDot, q->id, q->nodes[i]->id, q->desc[i]);
		strcat(aux, tmp);
	}

    free(tmp);
	tmp = *output;
	*output = aux;
    free(tmp);
    q->visited = True;
	for (int i = 0; i < q->n; i++)
        if (q->nodes[i]->id > q->id && !q->nodes[i]->visited)
		    makeString( q->nodes[i], output);
	return 0;
}

char * charToString(char x){
    char * res = (char *) malloc(2 * sizeof(char));
    res[0] = x;
    res[1] = '\0';
    return res;
}

char * getDotNotation(struct Thompson * __q, char * Regex){
    int i = 0, finalState;
    struct Thompson * iterator = getFinal(__q);
	char * res = (char *) malloc(2 * strlen(graphDotHeader) * sizeof(char));
	char * aux = (char *) malloc((strlen(Regex) + 50) * sizeof(char));
	giveId(__q, &i);
	sprintf(res, graphDotHeader, (float) (rand() % 1000)/1000, iterator->id);
	makeString(__q, &res);
    sprintf(aux,"\tlabel = \"NFA of Thompson of: %s\";\n\0", Regex);
	strcat(res, aux);
	strcat(res, graphDotTail);
	free(aux);
	return res;
}

char * addConcatSym(char * regex){
    char * aux = (char *) malloc(2 * strlen(regex) * sizeof(char)), * res;
    res = aux;
    while (*aux++ = *regex++)
        if (isalpha( *regex ) && !isGrouping(*(regex - 1)))
            *aux++ = '.';
    return res;
}

void copyStruct(struct Thompson * __dest, struct Thompson * __src ){
	__dest->n = __src->n;
    __dest->desc = __src->desc;
    __dest->final = False;
	__dest->nodes = __src->nodes;
}

struct Thompson * getFinal(struct Thompson * __init){
	while (!__init->final) __init = __init->nodes[0];
	return __init;
}

void __errorHandler(int __cod, char * __inf){
	char * msg = (char *) malloc(120 * sizeof(char));
	if(__cod == 0)
		sprintf(msg, "No recognized character: --- %s ---", __inf);
	else if(__cod == 1)
		strcpy(msg, __inf);
	perror(msg);
	free(msg);
}

int hasConcatSym(char * __regex){
	while (*__regex++ != '\0')
		if (*__regex == '.')
			return True;
	return False;			
}
