#include <iostream>
#include <string>
using namespace std;

enum Destino{
  SAO_PAULO,
  RIO_DE_JANEIRO,
  BELO_HORIZONTE,
  };

struct Passagem{
    string nomePassageiro;
    Destino destino;
    float Valor;
};

void exibirDestinos(){

 cout << " 1 - Sao Paulo \n";
 cout << " 2 - Rio de Janeiro \n";
 cout << " 3 - Belo Horizonte\n";
}

Destino selecionarDestino(int escolha){

  switch(escolha){
   case 1: return SAO_PAULO;
     case 2: return RIO_DE_JANEIRO;
       case 3: return BELO_HORIZONTE;
         default: return SAO_PAULO;
  }
}

float calcularValor(Destino destino){
  switch(destino){
    case SAO_PAULO: return 200.0;
      case RIO_DE_JANEIRO: return 250.0;
        case BELO_HORIZONTE: return 300.0;
          default: return 0;
  }
}

void exibirPassagens ( const Passagem &passagem){

  cout << "\n Passagem comprada com sucesso!\n";
  cout << "Passageiro:" << passagem.nomePassageiro << endl;
  cout << "Destino:";

  switch(passagem.destino){
    case SAO_PAULO: cout << "Sao Paulo";
      break;
      case RIO_DE_JANEIRO: cout << "Rio de Janeiro";
        break;
        case BELO_HORIZONTE: cout << "Belo Horizonte";
          break;
  }

  cout << "\n Preco: R$" << passagem.Valor << endl;
}

int main (){
  Passagem passagem;
  int escolhadeDestino;

  cout << " Venda de Passagem de onibus\n";
  cout << " Digite seu nome: ";
  getline(cin, passagem.nomePassageiro);

  exibirDestinos();
  cout << " Digite seu destino: ";
  cin >> escolhadeDestino;
  passagem.destino = selecionarDestino(escolhadeDestino);
  passagem.Valor = calcularValor(passagem.destino);

  exibirPassagens(passagem);
  return 0;
}




