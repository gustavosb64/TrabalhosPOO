package SO;

public class D_Impressao{
    public static final int CARGA_MAX = 3;

    private boolean ligado;
    private boolean status;
    private boolean colorido;
    private int cargaTinta;
    private boolean paginaEmperrada;
     
    //CONSTRUTOR
    D_Impressao(){
        this.ligado = false;
        this.status = true;
        this.colorido = true;
        this.cargaTinta = CARGA_MAX;
        this.paginaEmperrada = false;
    }
    
    /*FUNÇÕES EM COMUM*/
    public void ligaDispositivo(){
        this.ligado = true;
        return;
    }

    public void desligaDispositivo(){
        this.ligado = false;
        return;
    }

    public boolean verificaStatus(){
        executaTeste();
        return this.status;
    }

    /*FUNÇÕES ESPECÍFICAS*/
    public void inserirCargaTinta(){
        this.cargaTinta = CARGA_MAX;
        return;
    }

    public void executaTeste(){

        if (this.cargaTinta == 0 || this.paginaEmperrada){
            this.status = false;
        }

        return;
    }

    public void imprimePaginas(int n_paginas){
        if (verificaStatus()){
            this.cargaTinta--; 
            System.out.println("Impressão realizada com sucesso!");
            return;
        }

        System.out.println("Erro na impressão!");

        return;
    }

}
