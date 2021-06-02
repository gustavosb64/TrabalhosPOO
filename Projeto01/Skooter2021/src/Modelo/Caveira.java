package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class Caveira extends Elemento implements Serializable{
    private int iContaFrames;
    
    public Caveira(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = true;
        this.iContaFrames = 0;
    }

    public void autoDesenho() {
        super.autoDesenho();

        this.iContaFrames++;
        /*A cada intervalo de Consts.TIMER_DISPARO milisegundos, cria um fakenews na posicao a direita*/
        if(this.iContaFrames == Consts.TIMER_DISPARO){
            this.iContaFrames = 0;
            FakeNews f = new FakeNews("fakenews.png");
            f.setPosicao(this.pPosicao.getLinha()-1,this.pPosicao.getColuna());
            Desenhador.getTelaDoJogo().addElemento(f);
        }
    }    
}
