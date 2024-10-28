#include <stdio.h>
#include <string.h>

void f0(char cadena[]);
void f1(char cadena[]);
void f2(char cadena[]);
void f3(char cadena[]);
void f4(char cadena[]);
void f5(char cadena[]);
void f6(char cadena[]);

int main(){
	char nombre[6];
	f0(nombre);
	return 0;
}

void f0(char cadena[]){
	strcat(cadena, "A");
	f1(cadena);
}
void f1(char cadena[]){
	strcat(cadena, "l");
	f2(cadena);
}
void f2(char cadena[]){
	strcat(cadena, "e");
	f3(cadena);
}
void f3(char cadena[]){
	strcat(cadena, "x");
	f4(cadena);
}
void f4(char cadena[]){
	strcat(cadena, "i");
	f5(cadena);
}
void f5(char cadena[]){
	strcat(cadena, "s");
	f6(cadena);
}
void f6(char cadena[]){
	printf("%s", cadena);
}
