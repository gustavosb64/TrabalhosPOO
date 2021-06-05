package SO;    

import java.util.Scanner;

public class D_Video{

    //CONSTANTES
    public static final int TEMP_MAX = 255;
    public static final int TEMP_MIN = -255;
    public static final int BRILHO_MAX = 100;
    public static final int BRILHO_MIN = 0;
    public static final String RES_1 = "16:9";
    public static final String RES_2 = "16:10";
    public static final String RES_1 = "4:3";

    //ATRIBUTOS
    private boolean ligado;
    private boolean telaBloqueada;
    private boolean luzNoturna;
    private int temperaturaCor;
    private int brilho;
    private String resolucao;

    //CONSTRUTOR
    D_Video(){
        this.ligado = false;
        this.telaBloqueada = false;
        this.luzNoturna = false;
        this.temperaturaCor = 0;
        this.brilho = 50;
        this.resolucao = RES_1;
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
        System.out.println("Temperatura :" + this.temperaturaCor);
        System.out.println("Brilho :" + this.brilho);
        System.out.println("Resolução :" + this.resolucao);

        if (this.luzNoturna) System.out.println("Luz noturna: Ligada");
        else System.out.println("Luz noturna: Desligada");
    }

    public boolean executaTeste(){
        return !telaBloqueada;
    }
    
    /*FUNÇÕES ESPECÍFICOS*/
    public void aumentarBrilho(){
        if (this.brilho <= BRILHO_MAX && executaTeste()){
            this.brilho += 5;
        }
        return;
    }

    public void diminuirBrilho(){
        if (this.brilho >= BRILHO_MIN && executaTeste(){
            this.brilho -= 5;
        }
        return;
    }

    public void ativarLuzNoturna(){
        this.brilho = 30;
        this.temperaturaCor = 150;
    }

    public void desativarLuzNoturna(){
        this.brilho = 50;
        this.temperaturaCor = 0;
    }

    public void bloquearTela(){
        this.telaBloqueada = true;
    }

    public void desbloquearTela(){
        this.telaBloqueada = false;
    }

    public void aumentarTemperaturaCor(){
        if (this.temperaturaCor <= TEMP_MAX){
            this.temperaturaCor += 10;
        }
        return;
    }

    public void diminuirTemperaturaCor(){
        if (this.temperaturaCor >= TEMP_MIN){
            this.temperaturaCor -= 10;
        }
        return;
    }

    public void alterarResolucao(){
        Scanner scanner = new Scanner(System.in);

        int flag;
        do{
            System.out.println("Selecione uma resolução:");
            System.out.println("1 - 16:9");
            System.out.println("2 - 16:10");
            System.out.println("3 - 4:3");
           
            flag = scanner.nextInt(); 
                
        }while (flag < 1 || flag > 3); 
       
        if (flag == 1) this.resolucao = RES_1;
        else if (flag == 2) this.resolucao = RES_2;
        else if (flag == 3) this.resolucao = RES_3;

        return;
    }


}
