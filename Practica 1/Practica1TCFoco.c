#include <stdio.h>

void on();
void off();

int main(){
	int valor=0;
	printf("Foco apagado\n");
	while(valor==0 || valor==1){
		printf("Presiona 1 para encender el foco, Presiona 0 para apagarlo\n");
		scanf("%i", &valor);
		if(valor==0){
			off();
		}else if(valor==1){
			on();
		}else{
			printf("Valor invalido");
		}
	}
	return 0;
}

void on(){
	printf("Foco encendido\n");
}
void off(){
	printf("Foco apagado\n");
}
