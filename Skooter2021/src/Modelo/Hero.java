package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Junio
 */
@SuppressWarnings("serial")
public class Hero extends Animado implements Serializable{
    public Hero(String sNomeImagePNG) {
        super(sNomeImagePNG);
    }

    public void voltaAUltimaPosicao(){
        this.pPosicao.volta();
    }

    @Override
	public boolean moveUp() {
	       return this.pPosicao.moveUp();
	   }
	
	@Override
	public boolean moveDown() {
	       return this.pPosicao.moveDown();
	}

	@Override
	public boolean moveRight() {
	       return this.pPosicao.moveRight();
	}

	@Override
	public boolean moveLeft() {
	       return this.pPosicao.moveLeft();
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
