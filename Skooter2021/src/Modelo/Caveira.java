package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

import Auxiliar.Consts;
import Auxiliar.Desenhador;

@SuppressWarnings("serial")
public class Caveira extends Elemento implements Serializable{
    private int iContaFrames;
    
    public Caveira(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = true;
        this.iContaFrames = 0;
    }

	public void autoDesenho(ArrayList<Elemento> ListElem, int index) {
        super.autoDesenho(ListElem, index);

        this.iContaFrames++;
        /*A cada intervalo de Consts.TIMER_DISPARO milisegundos, cria um fakenews na posicao a direita*/
        if(this.iContaFrames == Consts.TIMER_DISPARO){
            this.iContaFrames = 0;
            FakeNews f = new FakeNews("fakenews.png");
            f.setPosicao(this.pPosicao.getLinha()-1,this.pPosicao.getColuna());
            Desenhador.getTelaDoJogo().addElemento(f);
        }
    }    

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        e.remove(this); 
        return true;
    }
}
