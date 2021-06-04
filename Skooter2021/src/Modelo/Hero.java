package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Junio
 */
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
}
