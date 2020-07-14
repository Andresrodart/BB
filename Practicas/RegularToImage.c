#include <stdio.h> 
#include <stdlib.h> 
#include <string.h>
#include <time.h>
#include "thompson.h"
/*
	Autor: Andrés Rodarte López
	Description: Program that recives a ReGex and produces
		a representation of it in .dot notation
	Syntax:
		- ()	are grouping symbols
		- .		is a concatenation operator
		- *		is a Kleene operator
		- +		is a addition operator
		- |		is a union oparator
		E.g.: 
			> (ab)* = (a.b)*
			> ab*	= a.(b*)
	
*/

int main(int n, char const *argv[]){
	struct Thompson * graph;
	int len = strlen(argv[1]), x;
	FILE * out_file = fopen("NFA.dot", "w+");
	char * ReGex = (char *) calloc(len, sizeof(char)), * res;
	
	// To give random back ground color
	srand(time(0));
	if (out_file == NULL)  
		perror("Error! Could not open file\n"); 
	strcpy(ReGex, argv[1]);	
	
	graph = makeGraph(ReGex);
	res = getDotNotation(graph, ReGex);
	x = fprintf(out_file, res);
	fclose(out_file);
	system("dot -Tpng NFA.dot > NFA.png "); //&& eog NFA.png
	return 0;
}