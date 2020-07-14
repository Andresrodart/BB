#if !defined(True)
#define True  (1==1)
#endif // BOOL

#if !defined(False)
#define False (!True)
#endif // BOOL

#if !defined(epsilonDot)
/*Epsilon character*/
#define epsilonDot "&epsilon;\0"
#endif

#if !defined(transitionDot)
/*Basic transition in .dot notation %d -> %d [ label = \"%s\" ];\0*/
#define transitionDot "\t%d -> %d [ label = \"%s\" ];\n\0"
#endif

#if !defined(finalStateDot)
/*Basic transition in .dot notation %d -> %d [ label = \"%s\" ];\0*/
#define finalStateDot "\tnode [shape = doublecircle] %d;\n\0"
#endif

#if !defined(graphDotHeader)
/*Basic graph in .dot notation */
#define graphDotHeader "\
digraph finite_state_machine{\n\
    rankdir=LR;\n\
    subgraph cluster{\n\
        style = \"rounded,filled\";\n\
        color = \"#000000\";\n\
        fillcolor = \"%4.3f 0.3 0.9\";\n\
        node [shape = point ] qi;\n\
        node [style = \"rounded,filled\", color = \"#000000\", fillcolor = white, shape = doublecircle] %d;\n\
        node [style = \"rounded,filled\", color = \"#000000\", fillcolor = white, shape=\"oval\"];\n\
        qi -> 0 [ label = \"Start\" ];\n\0"
#endif
#if !defined(graphDotTail)
/*Basic graph in .dot notation */
#define graphDotTail "\
    }\n\
}\0"
#endif

#ifndef THOMPSON_h_
#define THOMPSON_h_
/*Struct for each node in a Thompson NFA*/
struct Thompson{
    /*id, number of connections or bool flag for final*/
	unsigned int id, n, final, visited;
    /*Describe movement to nodes[i] with char[i]*/
    char * * desc;
    /*0: R - 1: L*/
    struct Thompson * * nodes;
};
/*Read the regex, it will read character and determinate
which function execute. Returns a pointer to the q of the
NDA of Thompson.*/
struct Thompson * readReGex(char * regex, int * len);
/*Make an empty node of type struct Thompson where n indicates if has 1 or 2 transitions
and id = UINT_MAX if not defined 
	int id, n, final;
    char * desc;
    struct Thompson * * nodes;*/
struct Thompson * makeNode(int n);
/*Start proces of making a Thompson FNA*/
struct Thompson * makeGraph(char * __regex);
/*Make a literal tamplate, fill it and return a pointer to q*/
struct Thompson * makeLiteral(char * x);
/*Make a concatenation template, fill it and return a pointer to q*/
struct Thompson * makeConcatenation(char * regex, int * len);
/*Make a alternation template, fill it and return a pointer to q*/
struct Thompson * makeAlternation(char * regex, int * len);
/*Make a Kleene template, fill it and return a pointer to q*/
struct Thompson * makeKleene(char * regex, int * len);
/*Make a add (+) template, fill it and return a pointer to q*/
struct Thompson * makeAdd(char * regex, int * len);
/*Get final node*/
struct Thompson * getFinal(struct Thompson * __init); 
/*Make string for .dot file*/
int makeString(struct Thompson * q, char * * output);
/*Check ReGex syntax True if contains . False else*/
int hasConcatSym(char * __regex);
/*Auxiliary function to get the code in .dot format */
char * getDotNotation(struct Thompson * q, char * Regex);
/*Auxliar function to transform char into char* */
char * charToString(char x);
/*Auxiliary function to add . to a Regex*/
char * addConcatSym(char * regex);
/*Give id to all nodes recursively*/
void giveId(struct Thompson * q, int * serial);
/*Copy struct contet from x to y*/
void copyStruct(struct Thompson * __dest, struct Thompson * __src );
/*Error handler*/
void __errorHandler(int __cod, char * __inf);
#endif // THOMPSON_h_