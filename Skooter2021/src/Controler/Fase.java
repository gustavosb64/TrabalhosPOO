package Controler;

import java.util.ArrayList;

import Modelo.BlocoVermelhoPrisma;
import Modelo.BlocoVermelhoLiso;
import Modelo.BlocoVerdeLiso;
import Modelo.BlocoVerdePrisma;
import Modelo.Coracao;
import Modelo.Elemento;
import Modelo.Fruta;
import Modelo.Hero;
import Modelo.Orientacao;
import Modelo.Robo;
import Modelo.Seta;

@SuppressWarnings("serial")
public class Fase extends ArrayList<Elemento>{
	
    public Fase CriaFase1(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(6, 4);
        this.add(hHero);
        
        Coracao coracao = new Coracao("heart.png");
        coracao.setPosicao(4, 4);
        this.add(coracao);
        
        Fruta banana = new Fruta("fruta_banana.png");
        banana.setPosicao(0, 0);
        this.add(banana);
        
        Fruta banana2 = new Fruta("fruta_banana.png");
        banana2.setPosicao(2, 2);
        this.add(banana2);
        
        Fruta banana3 = new Fruta("fruta_banana.png");
        banana3.setPosicao(4, 3);
        this.add(banana3);
        
        BlocoVerdePrisma bloco0_1 = new BlocoVerdePrisma("bloco_verde.png");
        bloco0_1.setPosicao(0, 1);
        this.add(bloco0_1);
        
        BlocoVermelhoLiso bloco0_2 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco0_2.setPosicao(1, 1);
        this.add(bloco0_2);
        
        BlocoVerdePrisma bloco1_2 = new BlocoVerdePrisma("bloco_verde.png");
        bloco1_2.setPosicao(1, 2);
        this.add(bloco1_2);
        
        BlocoVermelhoLiso bloco1_3 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco1_3.setPosicao(1, 3);
        this.add(bloco1_3);
        
        BlocoVerdePrisma bloco2_1 = new BlocoVerdePrisma("bloco_verde.png");
        bloco2_1.setPosicao(2, 1);
        this.add(bloco2_1);
        
        BlocoVermelhoLiso bloco3_1 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco3_1.setPosicao(3, 1);
        this.add(bloco3_1);
        
        BlocoVerdePrisma bloco3_0 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3_0.setPosicao(3, 0);
        this.add(bloco3_0);
        
        BlocoVerdePrisma bloco4_1 = new BlocoVerdePrisma("bloco_verde.png");
        bloco4_1.setPosicao(4, 1);
        this.add(bloco4_1);
        
        BlocoVermelhoLiso bloco5_2 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco5_2.setPosicao(5, 1);
        this.add(bloco5_2);
        
        BlocoVerdePrisma bloco5_3 = new BlocoVerdePrisma("bloco_verde.png");
        bloco5_3.setPosicao(5, 2);
        this.add(bloco5_3);
        
        BlocoVermelhoLiso bloco5_4 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco5_4.setPosicao(5, 3);
        this.add(bloco5_4);
        
        BlocoVermelhoLiso bloco3_3 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco3_3.setPosicao(3, 3);
        this.add(bloco3_3);
        
        BlocoVerdePrisma bloco0_5 = new BlocoVerdePrisma("bloco_verde.png");
        bloco0_5.setPosicao(0, 5);
        this.add(bloco0_5);
        
        BlocoVermelhoLiso bloco1_5 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco1_5.setPosicao(1, 5);
        this.add(bloco1_5);
        
        BlocoVerdePrisma bloco2_5 = new BlocoVerdePrisma("bloco_verde.png");
        bloco2_5.setPosicao(2, 5);
        this.add(bloco2_5);
        
        BlocoVermelhoLiso bloco3_5 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco3_5.setPosicao(3, 5);
        this.add(bloco3_5);
        
        BlocoVermelhoLiso bloco7_1 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco7_1.setPosicao(7, 1);
        this.add(bloco7_1);
        
        BlocoVermelhoLiso bloco7_3 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco7_3.setPosicao(7, 3);
        this.add(bloco7_3);
        
        BlocoVermelhoLiso bloco7_5 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco7_5.setPosicao(7, 5);
        this.add(bloco7_5);
        
        BlocoVermelhoLiso bloco7_7 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco7_7.setPosicao(7, 7);
        this.add(bloco7_7);
        
        BlocoVerdePrisma bloco7_8 = new BlocoVerdePrisma("bloco_verde.png");
        bloco7_8.setPosicao(7, 8);
        this.add(bloco7_8);
        
        BlocoVermelhoLiso bloco7_9 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
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
        
        
        BlocoVermelhoLiso bloco9_1 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco9_1.setPosicao(9, 1);
        this.add(bloco9_1);
        
        BlocoVerdePrisma bloco9_2 = new BlocoVerdePrisma("bloco_verde.png");
        bloco9_2.setPosicao(9, 2);
        this.add(bloco9_2);
        
        BlocoVermelhoLiso bloco9_3 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco9_3.setPosicao(9, 3);
        this.add(bloco9_3);
        
        BlocoVermelhoLiso bloco9_5 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco9_5.setPosicao(9, 5);
        this.add(bloco9_5);
        
        BlocoVerdePrisma bloco9_6 = new BlocoVerdePrisma("bloco_verde.png");
        bloco9_6.setPosicao(9, 6);
        this.add(bloco9_6);
        
        BlocoVermelhoLiso bloco9_7 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco9_7.setPosicao(9, 7);
        this.add(bloco9_7);
        
        BlocoVerdePrisma bloco9_8 = new BlocoVerdePrisma("bloco_verde.png");
        bloco9_8.setPosicao(9, 8);
        this.add(bloco9_8);
        
        BlocoVermelhoLiso bloco9_9 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco9_9.setPosicao(9, 9);
        this.add(bloco9_9);
        
        BlocoVermelhoLiso bloco1_7 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco1_7.setPosicao(1, 7);
        this.add(bloco1_7);
        
        BlocoVerdePrisma bloco1_8 = new BlocoVerdePrisma("bloco_verde.png");
        bloco1_8.setPosicao(1, 8);
        this.add(bloco1_8);
        
        BlocoVermelhoLiso bloco1_9 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco1_9.setPosicao(1, 9);
        this.add(bloco1_9);
        
        BlocoVerdePrisma bloco1_10 = new BlocoVerdePrisma("bloco_verde.png");
        bloco1_10.setPosicao(1, 10);
        this.add(bloco1_10);
        
        BlocoVerdePrisma bloco6_5 = new BlocoVerdePrisma("bloco_verde.png");
        bloco6_5.setPosicao(6,5);
        this.add(bloco6_5);
        
        BlocoVermelhoLiso bloco5_5 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco5_5.setPosicao(5, 5);
        this.add(bloco5_5);
        
        BlocoVerdePrisma bloco5_6 = new BlocoVerdePrisma("bloco_verde.png");
        bloco5_6.setPosicao(5,6);
        this.add(bloco5_6);
        
        BlocoVermelhoLiso bloco5_7 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco5_7.setPosicao(5, 7);
        this.add(bloco5_7);
        
        BlocoVerdePrisma bloco6_7 = new BlocoVerdePrisma("bloco_verde.png");
        bloco6_7.setPosicao(6,7);
        this.add(bloco6_7);
        
        BlocoVermelhoLiso bloco3_7 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco3_7.setPosicao(3, 7);
        this.add(bloco3_7);
        
        BlocoVerdePrisma bloco3_8 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3_8.setPosicao(3,8);
        this.add(bloco3_8);
        
        BlocoVermelhoLiso bloco3_9 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco3_9.setPosicao(3, 9);
        this.add(bloco3_9);
        
        BlocoVerdePrisma bloco4_9 = new BlocoVerdePrisma("bloco_verde.png");
        bloco4_9.setPosicao(4,9);
        this.add(bloco4_9);
        
        BlocoVermelhoLiso bloco5_9 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
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
        
        Fruta banana = new Fruta("fruta_banana.png");
        banana.setPosicao(6, 8);
        this.add(banana);
        
        
        BlocoVermelhoLiso bloco = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        bloco.setPosicao(1, 3);
        this.add(bloco);
        
        BlocoVermelhoLiso blocoEs = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        blocoEs.setPosicao(5, 5);
        this.add(blocoEs);
        
        BlocoVermelhoLiso blocoEs2 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        blocoEs2.setPosicao(6, 4);
        this.add(blocoEs2);
        
        BlocoVermelhoPrisma blocou2 = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
        blocou2.setPosicao(3, 3);
        this.add(blocou2);

        Robo cRobo4 = new Robo("robo_azul.png");
        cRobo4.setPosicao(6, 5);        
        this.add(cRobo4);
        
        BlocoVermelhoLiso blocoEs3 = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        blocoEs3.setPosicao(6, 6);
        this.add(blocoEs3);

        BlocoVerdePrisma blocoverde1 = new BlocoVerdePrisma("bloco_verde.png");
        blocoverde1.setPosicao(7, 5);
        this.add(blocoverde1);
        
        BlocoVerdePrisma bloco3 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3.setPosicao(5, 2);
        this.add(bloco3);
        
        BlocoVerdeLiso bloco4 = new BlocoVerdeLiso("bloco_verde_liso.png");
        bloco4.setPosicao(6, 2);
        this.add(bloco4);
        
        BlocoVermelhoPrisma bloco2 = new BlocoVermelhoPrisma("bloco_vermelho_liso.png");
        bloco2.setPosicao(3, 5);
        this.add(bloco2);  

        Coracao cCoracao = new Coracao("heart.png");
        cCoracao.setPosicao(3, 3);
        this.add(cCoracao);

        Robo cRobo = new Robo("robo_azul.png");
        cRobo.setPosicao(7, 2);        
        this.add(cRobo);
        
        Seta cSeta1 = new Seta("seta_cima.png", Orientacao.CIMA);
        cSeta1.setPosicao(3, 5);        
        this.add(cSeta1);

        Seta cSeta2 = new Seta("seta_cima.png", Orientacao.CIMA);
        cSeta2.setPosicao(6, 5);        
        this.add(cSeta2);

        Seta cSeta3 = new Seta("seta_cima.png", Orientacao.CIMA);
        cSeta3.setPosicao(3, 5);        
        this.add(cSeta3);
        return this;
    }

    public Fase CriaFase3(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(6, 4);
        this.add(hHero);
        
        //Colocando blocos vermelhos com prisma
        BlocoVermelhoPrisma BVmP; 
        for (int i=1; i<10; i++){
            BVmP = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
            BVmP.setPosicao(i, 1);
            this.add(BVmP);
        }
        for (int i=1; i<10; i++){
            BVmP = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
            BVmP.setPosicao(i, 9);
            this.add(BVmP);
        }
        for (int i=2; i<9; i++){
            BVmP = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
            BVmP.setPosicao(1, i);
            this.add(BVmP);
        }
        for (int i=2; i<9; i++){
            BVmP = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
            BVmP.setPosicao(9, i);
            this.add(BVmP);
        }

        for (int i=3; i<8; i++){
            BVmP = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
            BVmP.setPosicao(3, i);
            this.add(BVmP);
        }

        for (int i=3; i<8; i++){
            BVmP = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
            BVmP.setPosicao(7, i);
            this.add(BVmP);
        }
        for (int i=4; i<7; i++){
            BVmP = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
            BVmP.setPosicao(i, 3);
            this.add(BVmP);
        }
    
        for (int i=4; i<7; i++){
            BVmP = new BlocoVermelhoPrisma("bloco_vermelho_prisma.png");
            BVmP.setPosicao(i, 7);
            this.add(BVmP);
        }

        //Colocando frutas
        Fruta fruta;
        fruta = new Fruta("fruta_banana.png");
        fruta.setPosicao(5, 0);
        this.add(fruta);

        fruta = new Fruta("fruta_cereja.png");
        fruta.setPosicao(5, 2);
        this.add(fruta);
        
        fruta = new Fruta("fruta_banana.png");
        fruta.setPosicao(5, 8);
        this.add(fruta);

        fruta = new Fruta("fruta_morango.png");
        fruta.setPosicao(5, 10);
        this.add(fruta);

        //Colocando robôs
        Robo robo;
        robo = new Robo("robo_azul.png");
        robo.setPosicao(0, 5);
        this.add(robo);

        robo = new Robo("robo_azul.png");
        robo.setPosicao(2, 5);
        this.add(robo);

        robo = new Robo("robo_azul.png");
        robo.setPosicao(8, 5);
        this.add(robo);

        robo = new Robo("robo_azul.png");
        robo.setPosicao(10, 5);
        this.add(robo);

        return this;
    }

    public Fase CriaFase4(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(4, 5);
        this.add(hHero);
        
        //Colocando blocos verdes lisos
        BlocoVerdeLiso BVdL; 
        for (int i=1; i<10; i+=2){
            for (int j=1; j<10; j+=2){
                BVdL = new BlocoVerdeLiso("bloco_verde_liso.png");
                BVdL.setPosicao(i, j);
                this.add(BVdL);
                }
        }
        for (int i=2; i<9; i+=2){
            for (int j=2; j<9; j+=2){
                BVdL = new BlocoVerdeLiso("bloco_verde_liso.png");
                BVdL.setPosicao(i, j);
                this.add(BVdL);
                }
        }

        //Colocando robôs
        Robo robo;
        robo = new Robo("robo_azul.png");
        robo.setPosicao(0, 5);
        this.add(robo);

        robo = new Robo("robo_amarelo.png");
        robo.setPosicao(10, 5);
        this.add(robo);

        robo = new Robo("robo_amarelo.png");
        robo.setPosicao(5, 0);
        this.add(robo);

        robo = new Robo("robo_azul.png");
        robo.setPosicao(5, 10);
        this.add(robo);

        //Colocando frutas
        Fruta fruta;
        fruta = new Fruta("fruta_banana.png");
        fruta.setPosicao(0, 0);
        this.add(fruta);

        fruta = new Fruta("fruta_cereja.png");
        fruta.setPosicao(10, 0);
        this.add(fruta);
        
        fruta = new Fruta("fruta_banana.png");
        fruta.setPosicao(0, 10);
        this.add(fruta);

        fruta = new Fruta("fruta_morango.png");
        fruta.setPosicao(10, 10);
        this.add(fruta);

        //Colocando blocos vermelhos lisos
        BlocoVermelhoLiso BVmL;
        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(0, 3);
        this.add(BVmL);
        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(0, 7);
        this.add(BVmL);

        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(1, 0);
        this.add(BVmL);
        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(1, 8);
        this.add(BVmL);

        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(2, 5);
        this.add(BVmL);

        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(3, 2);
        this.add(BVmL);
        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(3, 10);
        this.add(BVmL);

        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(5, 2);
        this.add(BVmL);
        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(5, 8);
        this.add(BVmL);

        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(6, 3);
        this.add(BVmL);

        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(7, 0);
        this.add(BVmL);

        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(8, 1);
        this.add(BVmL);
        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(8, 7);
        this.add(BVmL);
        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(8, 10);
        this.add(BVmL);

        BVmL = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        BVmL.setPosicao(10, 1);
        this.add(BVmL);

        return this;
    }
}
