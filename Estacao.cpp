#include<stdio.h>
#include <stdlib.h>
#include <string.h>
 
  typedef struct{
  	 int numero_passagem;
  	 char nome_cliente[100];
  	 char destino[100];
  	 char tipo_onibus[20];
  	 float valor;
  }Passagem;
  
  int escolheCidade{
  
      int cidade;
      
      printf("Opcoes de cidade:");
      printf("1 - São Paulo");
      printf("2 - Rio de Janeiro");
      printf("3 - Belo Horizonte");
	  printf("4 - Curitiba");
	  printf("Digite o numero da Cidade:");
	  scanf("%d", &cidade); 
  }
    
     
     
