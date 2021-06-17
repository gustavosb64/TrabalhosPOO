package Controler;

import java.util.ArrayList;

import Modelo.BlocoAnimado;
import Modelo.BlocoEstatico;
import Modelo.BlocoVerdePrisma;
import Modelo.Caveira;
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

       
        Robo cRobo = new Robo("robo_azul.png");
        cRobo.setPosicao(2, 0);        
        this.add(cRobo);
        
        Caveira cCaveira = new Caveira("caveira.png");
        cCaveira.setPosicao(7, 8);
        this.add(cCaveira);        
        
        return this;
    }
    
    public Fase CriaFase2(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(0, 7);
        this.add(hHero);
        
        Fruta banana = new Fruta("fruta_banana.png");
        banana.setPosicao(6, 8);
        this.add(banana);
        
        
        BlocoEstatico bloco = new BlocoEstatico("bloco_vermelho_liso.png");
        bloco.setPosicao(1, 3);
        this.add(bloco);
        
        BlocoEstatico blocoEs = new BlocoEstatico("bloco_vermelho_liso.png");
        blocoEs.setPosicao(5, 5);
        this.add(blocoEs);
        
        BlocoEstatico blocoEs2 = new BlocoEstatico("bloco_vermelho_liso.png");
        blocoEs2.setPosicao(6, 4);
        this.add(blocoEs2);

        Robo cRobo4 = new Robo("robo_azul.png");
        cRobo4.setPosicao(6, 5);        
        this.add(cRobo4);
        
        BlocoEstatico blocoEs3 = new BlocoEstatico("bloco_vermelho_liso.png");
        blocoEs3.setPosicao(6, 6);
        this.add(blocoEs3);

        BlocoVerdePrisma blocoverde1 = new BlocoVerdePrisma("bloco_verde.png");
        blocoverde1.setPosicao(7, 5);
        this.add(blocoverde1);
        
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

}
