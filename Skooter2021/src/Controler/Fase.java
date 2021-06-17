package Controler;

import java.util.ArrayList;

import Modelo.BlocoAnimado;
import Modelo.BlocoEstatico;
import Modelo.BlocoVerdePrisma;
import Modelo.Coracao;
import Modelo.Elemento;
import Modelo.Fruta;
import Modelo.Hero;
import Modelo.Robo;

@SuppressWarnings("serial")
public class Fase extends ArrayList<Elemento>{
	
    public Fase CriaFase1(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(6, 4);
        this.add(hHero);
        
        Fruta banana = new Fruta("fruta_banana.png");
        banana.setPosicao(0, 0);
        this.add(banana);
        
        BlocoVerdePrisma bloco0_1 = new BlocoVerdePrisma("bloco_verde.png");
        bloco0_1.setPosicao(0, 1);
        this.add(bloco0_1);
        
        BlocoEstatico bloco0_2 = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco0_2.setPosicao(1, 1);
        this.add(bloco0_2);
        
        BlocoVerdePrisma bloco1_2 = new BlocoVerdePrisma("bloco_verde.png");
        bloco1_2.setPosicao(1, 2);
        this.add(bloco1_2);
        
        BlocoEstatico bloco1_3 = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco1_3.setPosicao(1, 3);
        this.add(bloco1_3);
        
        BlocoVerdePrisma bloco2_1 = new BlocoVerdePrisma("bloco_verde.png");
        bloco2_1.setPosicao(2, 1);
        this.add(bloco2_1);
        
        BlocoEstatico bloco3_1 = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco3_1.setPosicao(3, 1);
        this.add(bloco3_1);
        
        BlocoVerdePrisma bloco3_0 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3_0.setPosicao(3, 0);
        this.add(bloco3_0);
        
        BlocoVerdePrisma bloco4_1 = new BlocoVerdePrisma("bloco_verde.png");
        bloco4_1.setPosicao(4, 1);
        this.add(bloco4_1);
        
        BlocoEstatico bloco5_2 = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco5_2.setPosicao(5, 1);
        this.add(bloco5_2);
        
        BlocoVerdePrisma bloco5_3 = new BlocoVerdePrisma("bloco_verde.png");
        bloco5_3.setPosicao(5, 2);
        this.add(bloco5_3);
        
        BlocoEstatico bloco5_4 = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco5_4.setPosicao(5, 3);
        this.add(bloco5_4);
        
        BlocoEstatico bloco3_3 = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco3_3.setPosicao(3, 3);
        this.add(bloco3_3);
        
        BlocoVerdePrisma bloco0_5 = new BlocoVerdePrisma("bloco_verde.png");
        bloco0_5.setPosicao(0, 5);
        this.add(bloco0_5);
        
        BlocoEstatico bloco1_5 = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco1_5.setPosicao(1, 5);
        this.add(bloco1_5);
        
        BlocoVerdePrisma bloco2_5 = new BlocoVerdePrisma("bloco_verde.png");
        bloco2_5.setPosicao(2, 5);
        this.add(bloco2_5);
        
        BlocoEstatico bloco3_5 = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco3_5.setPosicao(3, 5);
        this.add(bloco3_5);
        
        BlocoEstatico bloco7_1 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco7_1.setPosicao(7, 1);
        this.add(bloco7_1);
        
        BlocoEstatico bloco7_3 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco7_3.setPosicao(7, 3);
        this.add(bloco7_3);
        
        BlocoEstatico bloco7_5 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco7_5.setPosicao(7, 5);
        this.add(bloco7_5);
        
        BlocoEstatico bloco7_7 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco7_7.setPosicao(7, 7);
        this.add(bloco7_7);
        
        BlocoVerdePrisma bloco7_8 = new BlocoVerdePrisma("bloco_verde.png");
        bloco7_8.setPosicao(7, 8);
        this.add(bloco7_8);
        
        BlocoEstatico bloco7_9 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco7_9.setPosicao(7, 9);
        this.add(bloco7_9);
        
        BlocoVerdePrisma bloco7_10 = new BlocoVerdePrisma("bloco_verde.png");
        bloco7_10.setPosicao(7, 10);
        this.add(bloco7_10);
        
        BlocoVerdePrisma bloco8_3 = new BlocoVerdePrisma("bloco_verde.png");
        bloco8_3.setPosicao(8, 3);
        this.add(bloco8_3);
        
        BlocoVerdePrisma bloco8_9 = new BlocoVerdePrisma("bloco_verde.png");
        bloco8_9.setPosicao(8, 9);
        this.add(bloco8_9);
        
        
        BlocoEstatico bloco9_1 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco9_1.setPosicao(9, 1);
        this.add(bloco9_1);
        
        BlocoVerdePrisma bloco9_2 = new BlocoVerdePrisma("bloco_verde.png");
        bloco9_2.setPosicao(9, 2);
        this.add(bloco9_2);
        
        BlocoEstatico bloco9_3 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco9_3.setPosicao(9, 3);
        this.add(bloco9_3);
        
        BlocoEstatico bloco9_5 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco9_5.setPosicao(9, 5);
        this.add(bloco9_5);
        
        BlocoVerdePrisma bloco9_6 = new BlocoVerdePrisma("bloco_verde.png");
        bloco9_6.setPosicao(9, 6);
        this.add(bloco9_6);
        
        BlocoEstatico bloco9_7 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco9_7.setPosicao(9, 7);
        this.add(bloco9_7);
        
        BlocoVerdePrisma bloco9_8 = new BlocoVerdePrisma("bloco_verde.png");
        bloco9_8.setPosicao(9, 8);
        this.add(bloco9_8);
        
        BlocoEstatico bloco9_9 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco9_9.setPosicao(9, 9);
        this.add(bloco9_9);
        
        BlocoEstatico bloco1_7 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco1_7.setPosicao(1, 7);
        this.add(bloco1_7);
        
        BlocoVerdePrisma bloco1_8 = new BlocoVerdePrisma("bloco_verde.png");
        bloco1_8.setPosicao(1, 8);
        this.add(bloco1_8);
        
        BlocoEstatico bloco1_9 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco1_9.setPosicao(1, 9);
        this.add(bloco1_9);
        
        BlocoVerdePrisma bloco1_10 = new BlocoVerdePrisma("bloco_verde.png");
        bloco1_10.setPosicao(1, 10);
        this.add(bloco1_10);
        
        BlocoVerdePrisma bloco6_5 = new BlocoVerdePrisma("bloco_verde.png");
        bloco6_5.setPosicao(6,5);
        this.add(bloco6_5);
        
        BlocoEstatico bloco5_5 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco5_5.setPosicao(5, 5);
        this.add(bloco5_5);
        
        BlocoVerdePrisma bloco5_6 = new BlocoVerdePrisma("bloco_verde.png");
        bloco5_6.setPosicao(5,6);
        this.add(bloco5_6);
        
        BlocoEstatico bloco5_7 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco5_7.setPosicao(5, 7);
        this.add(bloco5_7);
        
        BlocoVerdePrisma bloco6_7 = new BlocoVerdePrisma("bloco_verde.png");
        bloco6_7.setPosicao(6,7);
        this.add(bloco6_7);
        
        BlocoEstatico bloco3_7 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco3_7.setPosicao(3, 7);
        this.add(bloco3_7);
        
        BlocoVerdePrisma bloco3_8 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3_8.setPosicao(3,8);
        this.add(bloco3_8);
        
        BlocoEstatico bloco3_9 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco3_9.setPosicao(3, 9);
        this.add(bloco3_9);
        
        BlocoVerdePrisma bloco4_9 = new BlocoVerdePrisma("bloco_verde.png");
        bloco4_9.setPosicao(4,9);
        this.add(bloco4_9);
        
        BlocoEstatico bloco5_9 = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco5_9.setPosicao(5,9);
        this.add(bloco5_9);
        
        BlocoVerdePrisma bloco10_7 = new BlocoVerdePrisma("bloco_verde.png");
        bloco10_7.setPosicao(10, 7);
        this.add(bloco10_7);
        

       
        Robo cRobo = new Robo("robo_azul.png");
        cRobo.setPosicao(2, 0);        
        this.add(cRobo);     
        
        return this;
    }
    
    public Fase CriaFase2(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(0, 7);
        this.add(hHero);
    
        BlocoVerdePrisma bloco3 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3.setPosicao(5, 2);
        this.add(bloco3);
        
        BlocoAnimado bloco2 = new BlocoAnimado("bloco_vermelho_liso.png");
        bloco2.setPosicao(3, 5);
        this.add(bloco2);  

        Coracao cCoracao = new Coracao("heart.png");
        cCoracao.setPosicao(3, 3);
        this.add(cCoracao);

        Robo cRobo = new Robo("robo_azul.png");
        cRobo.setPosicao(7, 2);        
        this.add(cRobo);
        
        return this;
    }

}
