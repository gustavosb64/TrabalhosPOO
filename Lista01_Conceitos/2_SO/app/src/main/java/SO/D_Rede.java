package SO;    

import java.util.Random;

public class D_Rede{
    public static final String STATUS_0 = "Sem sinal";
    public static final String STATUS_1 = "Sinal fraco";
    public static final String STATUS_2 = "Sinal bom";
    public static final String STATUS_3 = "Sinal excelente";

    private boolean ligado;
    private String status;
    private String nomeDispositivo;

    D_Rede(){
        this.ligado = false;
        this.status = STATUS_2;
        this.nomeDispositivo = "Dispositivo padrão";
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

    public void verificaStatus(){
        executaTeste();
        System.out.println(this.status);
        return;
    }

    public boolean executaTeste(){
        Random aleatorio = new Random();
        int v = aleatorio.nextInt(4);

        if (v == 0){
            this.status = STATUS_0;
            return false;
        }
        else if (v == 1) this.status = STATUS_1;
        else if (v == 2) this.status = STATUS_2;
        else if (v == 3) this.status = STATUS_3;

        return true;
    }

    /*FUNÇÕES ESPECÍFICAS*/
    public void enviaPacote(String url){
        if (!executaTeste()) System.out.println("Falha no envio de pacotes");
        else System.out.println("Enviando pacotes para: " + url);
    }

    public void nomearDispositivo(String nome){
        this.nomeDispositivo = nome;
    }
}
