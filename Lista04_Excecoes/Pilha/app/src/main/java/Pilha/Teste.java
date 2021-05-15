/*  Ha dois metodos relacionados a push e a pop em Pilha: um publico e um privado. O privado lanca a excecao
 *  A excecao de pop substitui o ultimo elemento pelo novo. A de pop apenas avisa que a pilha esta cheia
 *  Os elementos sao da classe Elem que contem um valor inteiro
*/
package Pilha;

public class Teste {

    public static void main(String[] args) {
        //Criando pilha com 3 elementos
        Pilha P = new Pilha(3); 

        //Criando objetos elemento
        Elem e1 = new Elem(1); 
        Elem e2 = new Elem(2); 
        Elem e3 = new Elem(3); 
        Elem e4 = new Elem(4); 

        P.pop(); //Uso de pop em pilha vazia

        P.push(e1);
        P.push(e2);
        P.push(e3);
        P.printPilha(); //Pilha antes do novo push

        P.push(e4); //Uso de push em pilha cheia
        P.printPilha(); //Pilha depois do novo push

        P.pop(); 

    }
}
