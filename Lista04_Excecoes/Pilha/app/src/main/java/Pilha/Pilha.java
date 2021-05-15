package Pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha{
    private List<Elem> listElem;
    private int size;
    
    public Pilha(int size) {
        this.size = size;
        this.listElem = new ArrayList<Elem>();
    }

    public void push(Elem e){
        try{
            this.pushException(e);
            System.out.println("Elemento inserido!");
        } 
        catch(Exception ePush){
            System.out.println("Substituindo ultimo elemento pelo novo");
            listElem.remove(listElem.size() - 1);
            listElem.add(e);
        }
        return;
    }

    private void pushException(Elem e) throws PilhaExcecao{
        if (listElem.size() == this.size) throw new PilhaCheiaException("Pilha cheia!");
        listElem.add(e);
        return;
    }

    public void pop(){
        try{
            this.popException();
            System.out.println("Pop realizado com sucesso.");
        }
        catch(Exception ePop){ 
            System.out.println("Nao e possivel eliminar elementos de pilhas vazias."); 
        }
        return;
    }

    private void popException() throws PilhaExcecao{
        if (listElem.size() == 0) throw new PilhaVaziaException("Pilha vazia!");
        listElem.remove(listElem.size() - 1);

        return;
    }

    public void printPilha(){
        System.out.println("\n=======PILHA=======");
        for (Elem v : listElem){
            System.out.println("Elemento: " + v.getValue());
        }
        System.out.println("===================\n");
        return;
    }

}
