package Controler;

import java.util.ArrayList;

import Modelo.BlocoAnimado;
import Modelo.BlocoEstatico;
import Modelo.BlocoVerdePrisma;
import Modelo.Caveira;
import Modelo.Coracao;
import Modelo.CoronaVirus;
import Modelo.Elemento;
import Modelo.Hero;
import Modelo.Robo;

@SuppressWarnings("serial")
public class Fase extends ArrayList<Elemento>{

    public Fase CriaFase1(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(0, 7);
        this.add(hHero);
        
        BlocoEstatico bloco = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco.setPosicao(3, 2);
        this.add(bloco);
        
        BlocoVerdePrisma bloco3 = new BlocoVerdePrisma("bloco_verde.png");
        bloco3.setPosicao(4, 6);
        this.add(bloco3);
        
        BlocoAnimado bloco2 = new BlocoAnimado("bloco_intransponivel_estatico.png");
        bloco2.setPosicao(4, 3);
        this.add(bloco2);
        
        CoronaVirus cTeste = new CoronaVirus("robo_azul.png");
        cTeste.setPosicao(5, 5);
        this.add(cTeste);     

        Coracao cCoracao = new Coracao("heart.png");
        cCoracao.setPosicao(3, 3);
        this.add(cCoracao);

        Robo cRobo = new Robo("robo_azul.png");
        cRobo.setPosicao(6, 2);        
        this.add(cRobo);
        
        Caveira cCaveira = new Caveira("caveira.png");
        cCaveira.setPosicao(7, 8);
        this.add(cCaveira);        

        return this;
    }

}
