package Controler;

import java.io.Serializable;
import java.util.ArrayList;

import Modelo.Bloco;
import Modelo.BlocoBase;
import Modelo.BlocoDestrutivelDecoration;
import Modelo.BlocoMovelDecoration;
import Modelo.BlocoVerdeLiso;
import Modelo.BlocoVerdePrisma;
import Modelo.BlocoVermelhoLiso;
import Modelo.BlocoVermelhoPrisma;
import Modelo.Coracao;
import Modelo.Elemento;
import Modelo.Fruta;
import Modelo.Hero;
import Modelo.Orientacao;
import Modelo.Robo;
import Modelo.Seta;


public class Fase extends ArrayList<Elemento> implements Serializable {
	
	private static final long serialVersionUID = -3265424110410076503L;

	public Fase criaFase5() {
		
		Hero hHero = Hero.getHero(); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(6, 4);
        this.add(hHero);
        
        Bloco bloco = new BlocoBase("bloco_verde.png");
        bloco = new BlocoDestrutivelDecoration("bloco_verde.png", bloco);
        bloco = new BlocoMovelDecoration("bloco_verde.png", bloco);
        
        
        ((Elemento) bloco).setPosicao(3, 3);
        this.add((Elemento) bloco);
        
        Fruta morango = new Fruta("fruta_morango.png");
        morango.setPosicao(9, 5);
        this.add(morango);
        
		return this;
	}
	
    public Fase CriaFase1(){

        Hero hHero = Hero.getHero(); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(6, 4);
        this.add(hHero);
               
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

        Robo cRobo = new Robo("robo_amarelo.png");
        cRobo.setPosicao(2, 0);        
        this.add(cRobo);     
        

        Robo robo2 = new Robo("robo_azul.png");
        robo2.setPosicao(0, 9);        
        this.add(robo2);

        Robo robo3 = new Robo("robo_azul.png");
        robo3.setPosicao(10, 1);        
        this.add(robo3);
        
        Robo robo4 = new Robo("robo_azul.png");
        robo4.setPosicao(10, 9);        
        this.add(robo4);
        
        BlocoVerdePrisma bloco9_0 = new BlocoVerdePrisma("bloco_verde.png");
        bloco7_8.setPosicao(9, 0);
        this.add(bloco9_0);
 
        Fruta morango = new Fruta("fruta_morango.png");
        morango.setPosicao(0, 0);
        this.add(morango);
        
        Fruta banana = new Fruta("fruta_banana.png");
        banana.setPosicao(0, 10);
        this.add(banana);
        
        Fruta cereja = new Fruta("fruta_cereja.png");
        cereja.setPosicao(10, 10);
        this.add(cereja);

        Fruta morango1 = new Fruta("fruta_morango.png");
        morango1.setPosicao(10, 0);
        this.add(morango1);
        
        return this;
    }
    
    public Fase CriaFase2(){

        Hero hHero = Hero.getHero(); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(0, 7);
        this.add(hHero);
        
        Fruta morango1 = new Fruta("fruta_morango.png");
        morango1.setPosicao(1, 5);
        this.add(morango1);
        
        Fruta banana = new Fruta("fruta_banana.png");
        banana.setPosicao(5, 1);
        this.add(banana);
        
        Fruta cereja = new Fruta("fruta_cereja.png");
        cereja.setPosicao(9, 5);
        this.add(cereja);
        
        Fruta morango = new Fruta("fruta_morango.png");
        morango.setPosicao(9, 5);
        this.add(morango);
        
        BlocoVermelhoLiso blocoVermelhoLiso; 
        for (int i=1; i<10; i += 2){
        	blocoVermelhoLiso = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        	blocoVermelhoLiso.setPosicao(3, i);
            this.add(blocoVermelhoLiso);
        }
        
        for (int i=1; i<10; i += 2){
        	blocoVermelhoLiso = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        	blocoVermelhoLiso.setPosicao(7, i);
            this.add(blocoVermelhoLiso);
        }
        
        for (int i=1; i<10; i += 4){
        	blocoVermelhoLiso = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        	blocoVermelhoLiso.setPosicao(i, 3);
            this.add(blocoVermelhoLiso);
        }
        
        for (int i=1; i<10; i += 4){
        	blocoVermelhoLiso = new BlocoVermelhoLiso("bloco_vermelho_liso.png");
        	blocoVermelhoLiso.setPosicao(i, 7);
            this.add(blocoVermelhoLiso);
        }
        
        Seta seta;
        for(int i = 3; i < 8; i++) {
        	seta = new Seta("seta_cima.png", Orientacao.CIMA);
        	seta.setPosicao(i, 0);
        	this.add(seta);
        }
        
        Seta seta0_3 = new Seta("seta_direita.png", Orientacao.DIREITA);
        seta0_3.setPosicao(0, 3);
        this.add(seta0_3);
        
        Seta seta0_7 = new Seta("seta_direita.png", Orientacao.DIREITA);
        seta0_7.setPosicao(0, 7);
        this.add(seta0_7);
        
        Seta seta2_3 = new Seta("seta_direita.png", Orientacao.DIREITA);
        seta2_3.setPosicao(2, 3);
        this.add(seta2_3);
        
        Seta seta2_4 = new Seta("seta_baixo", Orientacao.BAIXO);
        seta2_4.setPosicao(2, 4);
        this.add(seta2_4);
        
        Seta seta3_4 = new Seta("seta_baixo", Orientacao.BAIXO);
        seta3_4.setPosicao(3, 4);
        this.add(seta3_4);
        
        for (int i = 5; i < 8; i++) {
        	seta = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
        	seta.setPosicao(2, i);
        	this.add(seta);
		}
        
        Seta seta3_6 = new Seta("seta_cima.png", Orientacao.CIMA);
        seta3_6.setPosicao(3, 6);
        this.add(seta3_6);
        
        Seta seta3_2 = new Seta("seta_baixo", Orientacao.BAIXO);
        seta3_2.setPosicao(3, 2);
        this.add(seta3_2);
        
        Seta seta3_8 = new Seta("seta_cima.png", Orientacao.CIMA);
        seta3_8.setPosicao(3, 8);
        this.add(seta3_8);
        
        Seta seta3_10 = new Seta("seta_baixo", Orientacao.BAIXO);
        seta3_10.setPosicao(3, 10);
        this.add(seta3_10);
        
        Seta seta4_10 = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
    	seta4_10.setPosicao(4, 10);
    	this.add(seta4_10);
    	
    	Seta seta4_9 = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
    	seta4_9.setPosicao(4, 9);
    	this.add(seta4_9);
    	
    	Seta seta4_8 = new Seta("seta_cima.png", Orientacao.CIMA);
        seta4_8.setPosicao(4, 8);
        this.add(seta4_8);
        
        Seta seta4_7 = new Seta("seta_direita.png", Orientacao.DIREITA);
        seta4_7.setPosicao(4, 7);
        this.add(seta4_7);
        
        Seta seta6_3 = new Seta("seta_direita.png", Orientacao.DIREITA);
        seta6_3.setPosicao(6, 3);
        this.add(seta6_3);
        
        Seta seta6_7 = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
        seta6_7.setPosicao(6, 7);
        this.add(seta6_7);
        
        Seta seta7_2 = new Seta("seta_baixo", Orientacao.BAIXO);
        seta7_2.setPosicao(7, 2);
        this.add(seta7_2);
        
        Seta seta7_4 = new Seta("seta_baixo", Orientacao.BAIXO);
        seta7_4.setPosicao(7, 4);
        this.add(seta7_4);
        
        for (int i = 6; i < 11; i++) {
        	seta = new Seta("seta_cima.png", Orientacao.CIMA);
        	seta.setPosicao(7, i);
        	this.add(seta);
		}
        
        for (int i = 3; i < 8; i += 4) {
        	seta = new Seta("seta_direita.png", Orientacao.DIREITA);
        	seta.setPosicao(8, i);
        	this.add(seta);
		}
        
        for (int i = 3; i < 8; i += 4) {
        	seta = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
        	seta.setPosicao(10, i);
        	this.add(seta);
		}
        
        Robo robo1 = new Robo("robo_amarelo.png");
        robo1.setPosicao(1, 1);        
        this.add(robo1); 
        
        Robo robo2 = new Robo("robo_azul.png");
        robo2.setPosicao(9, 1);        
        this.add(robo2); 
        
        Robo robo3 = new Robo("robo_amarelo.png");
        robo3.setPosicao(9, 1);        
        this.add(robo3); 
        
        Robo robo4 = new Robo("robo_amarelo.png");
        robo4.setPosicao(9, 9);        
        this.add(robo4);
        
        Coracao coracao = new Coracao("heart.png");
        coracao.setPosicao(10, 8);
        this.add(coracao);
        
        
       return this;
    }

    public Fase CriaFase3(){

        Hero hHero = Hero.getHero(); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(5, 5);
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

        Hero hHero = Hero.getHero(); /* https://www.online-image-editor.com/ */
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
    
    public Fase getFase() {
    	return this;
    }
    
}
