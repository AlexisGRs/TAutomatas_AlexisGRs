#include <stdlib.h>
#include <stdio.h>
#include <string.h>

char* newCadena(int n);
void cadenas(int m, char palabras[], char alfabeto[], int n);

int main(){
	int n;
	char alfabeto[10];
	printf("ingresa la longitud de las cadenas y el alfabeto:\n");
	scanf("%d", &n);
	scanf("%s", alfabeto);
    printf("Cerradura de kleene:\n E\n");
	cadenas(0, newCadena(n), alfabeto, n);
	printf("\nCerradura de positiva:\n");
	cadenas(0, newCadena(n), alfabeto, n);
	return 0;
}

char* newCadena(int n){
	char *cadena=(char*)malloc(sizeof(char)*(n+1));
	return cadena;
}

void cadenas(int m, char palabras[], char alfabeto[], int n){
	int i;
	if(m<n){
		for(i=0;i<strlen(alfabeto);i++){
			palabras[m]=alfabeto[i];
			cadenas(m+1, palabras, alfabeto, n);
			palabras[m+1]='\0';
			printf(" (%s) ", palabras);
		    printf(" La longitud es:%i\n", strlen(palabras));	
		}
	}
}

