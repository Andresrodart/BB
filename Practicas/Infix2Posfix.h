#include <stdio.h> 
#include <string.h> 
#include <stdlib.h> 
#include "Stack.h"

int Prec(char ch) { 
	switch (ch) { 
		case '+': 
			return 3; 
		case '*': 
			return 3; 
		case '|': 
			return 2;
		case '.': 
			return 1; 
	} 
	return -1; 
} 

int isOperand(char ch){ 
    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'); 
} 
int isGrouping(char ch){
	return (ch =='(' || ch ==')' || ch =='{' || ch =='}' || ch =='[' || ch ==']' || ch =='|');
}
// The main function that converts given infix expression 
// to postfix expression.  
int infixToPostfix(char* exp){ 
	int i, k; 
  
	// Create a stack of capacity equal to expression size  
	struct Stack* stack = createStack(strlen(exp)); 
	if(!stack) // See if stack was created successfully  
		return -1 ; 
  
	for (i = 0, k = -1; exp[i]; ++i){ 
		// If the scanned character is an operand, add it to output. 
		if (isOperand(exp[i])) 
			exp[++k] = exp[i]; 
		  
		// If the scanned character is an ‘(‘, push it to the stack. 
		else if (exp[i] == '(') 
			push(stack, exp[i]); 
		  
		// If the scanned character is an ‘)’, pop and output from the stack  
		// until an ‘(‘ is encountered. 
		else if (exp[i] == ')'){ 
			while (!isEmpty(stack) && top(stack) != '(') 
				exp[++k] = pop(stack); 
			if (!isEmpty(stack) && top(stack) != '(') 
				return -1; // invalid expression              
			else
				pop(stack); 
		} else{// an operator is encountered 
			while (!isEmpty(stack) && Prec(exp[i]) <= Prec(top(stack))) 
				exp[++k] = pop(stack); 
			push(stack, exp[i]); 
		} 
  
	} 
  
	// pop all the operators from the stack 
	while (!isEmpty(stack)) 
		exp[++k] = pop(stack); 
  
	exp[++k] = '\0'; 
} 