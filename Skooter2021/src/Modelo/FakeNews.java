package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

import Auxiliar.Desenhador;

/**
 *
 * @author junio
 */
public class FakeNews extends Animado implements Serializable{
            
	private static final long serialVersionUID = 1L;

	public FakeNews(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bMortal = true;
    }

    public void autoDesenho() {
        super.autoDesenho();
        /*Movo a direita, quando nao poder se mover ainda mais para a direita, pede para ser removido do jogo*/
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
