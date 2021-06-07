package Controler;

import java.util.ArrayList;

import Modelo.BlocoAnimado;
import Modelo.BlocoEstatico;
import Modelo.Caveira;
import Modelo.CoronaVirus;
import Modelo.Elemento;
import Modelo.Hero;

@SuppressWarnings("serial")
public class Fase extends ArrayList<Elemento>{

    public Fase CriaFase1(){

        Hero hHero = new Hero("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(0, 7);
        this.add(hHero);
        
        BlocoEstatico bloco = new BlocoEstatico("bloco_intransponivel_estatico.png");
        bloco.setPosicao(3, 5);
        this.add(bloco);
        
        BlocoAnimado bloco2 = new BlocoAnimado("bloco_intransponivel_estatico.png");
        bloco2.setPosicao(4, 3);
        this.add(bloco2);
        
        CoronaVirus cTeste = new CoronaVirus("robo_azul.png");
        cTeste.setPosicao(5, 5);
        this.add(cTeste);     

        CoronaVirus cCorona = new CoronaVirus("robo.png");
        cCorona.setPosicao(3, 3);
        this.add(cCorona);

        CoronaVirus cRobo = new CoronaVirus("robo_azul.png");
        cCorona.setPosicao(6, 2);        
        this.add(cRobo);
        
        Caveira cCaveira = new Caveira("caveira.png");
        cCaveira.setPosicao(6, 7);
        this.add(cCaveira);        

        return this;
    }

}
