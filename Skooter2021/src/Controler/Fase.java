package Controler;

import java.util.ArrayList;

import Modelo.BlocoAnimado;
import Modelo.BlocoEstatico;
import Modelo.BlocoVerdePrisma;
import Modelo.Caveira;
import Modelo.Coracao;
import Modelo.CoronaVirus;
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
        hHero.setPosicao(0, 7);
        this.add(hHero);
        
        Fruta banana = new Fruta("banana.png");
        banana.setPosicao(6, 6);
        this.add(banana);
        
        BlocoEstatico bloco = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco.setPosicao(3, 2);
        this.add(bloco);
        
        BlocoVerdePrisma bloco3 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3.setPosicao(4, 6);
        this.add(bloco3);
        
        BlocoAnimado bloco2 = new BlocoAnimado("bloco_intransponivel_estatico.png");
        bloco2.setPosicao(3, 5);
        this.add(bloco2); 

        Coracao cCoracao = new Coracao("heart.png");
        cCoracao.setPosicao(3, 3);
        this.add(cCoracao);

        Robo cRobo = new Robo("robo_azul.png");
        cRobo.setPosicao(6, 2);        
        this.add(cRobo);
        
        Caveira cCaveira = new Caveira("caveira.png");
        cCaveira.setPosicao(7, 8);
        this.add(cCaveira);        

        Seta sSeta4 = new Seta("arrow_down.png", Orientacao.BAIXO);
        sSeta4.setPosicao(1, 5);
        this.add(sSeta4);        

        Seta sSeta3 = new Seta("arrow_down.png", Orientacao.BAIXO);
        sSeta3.setPosicao(2, 5);
        this.add(sSeta3);        

        Seta sSeta2 = new Seta("arrow_down.png", Orientacao.BAIXO);
        sSeta2.setPosicao(3, 5);
        this.add(sSeta2);        

        Seta sSeta1 = new Seta("arrow_down.png", Orientacao.BAIXO);
        sSeta1.setPosicao(7, 5);
        this.add(sSeta1);        

        return this;
    }
    
    public Fase CriaFase2(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(0, 7);
        this.add(hHero);
        
        Fruta banana = new Fruta("banana.png");
        banana.setPosicao(6, 6);
        this.add(banana);
        
        
        BlocoEstatico bloco = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco.setPosicao(1, 3);
        this.add(bloco);
        
        BlocoVerdePrisma bloco3 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3.setPosicao(5, 2);
        this.add(bloco3);
        
        BlocoAnimado bloco2 = new BlocoAnimado("bloco_intransponivel_estatico.png");
        bloco2.setPosicao(3, 5);
        this.add(bloco2);  

        Coracao cCoracao = new Coracao("heart.png");
        cCoracao.setPosicao(3, 3);
        this.add(cCoracao);

        Robo cRobo = new Robo("robo_azul.png");
        cRobo.setPosicao(7, 2);        
        this.add(cRobo);
        
        Caveira cCaveira = new Caveira("caveira.png");
        cCaveira.setPosicao(7, 8);
        this.add(cCaveira);        

        return this;
    }

}
