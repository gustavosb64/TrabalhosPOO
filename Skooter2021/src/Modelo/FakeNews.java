package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

import Auxiliar.Desenhador;

public class FakeNews extends Animado implements Serializable{
            
	private static final long serialVersionUID = 1L;

	public FakeNews(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bMortal = true;
    }

	public void autoDesenho(ArrayList<Elemento> ListElem, int index) {
        super.autoDesenho(ListElem, index);
        /*Movo a cima, quando nao poder se mover ainda mais para cima, pede para ser removido do jogo*/
        if(!this.moveUp())
            Desenhador.getTelaDoJogo().removeElemento(this);
    }

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }
}
