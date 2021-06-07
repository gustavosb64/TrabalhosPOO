package Modelo;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import Auxiliar.Posicao;

public class BlocoAnimado extends Animado {
	private static final long serialVersionUID = 1L;

	public BlocoAnimado(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = true;
		this.addKeyListener(this);
	}
	
	public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e) {
        Posicao p = hHeroi.getPosicao();
        Posicao posicaoAfrente = new Posicao(0,0);
        Elemento eTemp;
        
        if(teclaPressionada.getKeyCode() == KeyEvent.VK_UP)
        {
        	posicaoAfrente.setPosicao(p.getLinha()+1, p.getColuna());
			for(int i = 1; i < e.size(); i++) {
				eTemp = e.get(i);
				if(posicaoAfrente.estaNaMesmaPosicao(eTemp.getPosicao())) {
					super.setbTransponivel(false);
					return false;
				}
			}
			//boolean a = (p.getColunaAnterior() < p.getColuna()) ? super.moveUP() : super.moveLeft();
			super.moveUp();
			super.setbTransponivel(true);
			return true;
			
        }
        else if(teclaPressionada.getKeyCode() == KeyEvent.VK_DOWN) 
        {
        	posicaoAfrente.setPosicao(p.getLinha()-1, p.getColuna());
			for(int i = 1; i < e.size(); i++) {
				eTemp = e.get(i);
				if(posicaoAfrente.estaNaMesmaPosicao(eTemp.getPosicao())) {
					super.setbTransponivel(false);
					return false;
				}
			}
			//boolean a = (p.getColunaAnterior() < p.getColuna()) ? super.moveRight() : super.moveLeft();
			super.moveDown();
			super.setbTransponivel(true);
			return true;
			
        }
        else if(teclaPressionada.getKeyCode() == KeyEvent.VK_LEFT) 
        {
        	posicaoAfrente.setPosicao(p.getLinha()+1, p.getColuna());
			for(int i = 1; i < e.size(); i++) {
				eTemp = e.get(i);
				if(posicaoAfrente.estaNaMesmaPosicao(eTemp.getPosicao())) {
					super.setbTransponivel(false);
					return false;
				}
			}
			//boolean a = (p.getColunaAnterior() < p.getColuna()) ? super.moveRight() : super.moveLeft();
			super.moveLeft();
			super.setbTransponivel(true);
			return true;
			
        }
        else if(teclaPressionada.getKeyCode() == KeyEvent.VK_RIGHT) 
        {
        	posicaoAfrente.setPosicao(p.getLinha()+1, p.getColuna());
			for(int i = 1; i < e.size(); i++) {
				eTemp = e.get(i);
				if(posicaoAfrente.estaNaMesmaPosicao(eTemp.getPosicao())) {
					super.setbTransponivel(false);
					return false;
				}
			}
			//boolean a = (p.getColunaAnterior() < p.getColuna()) ? super.moveRight() : super.moveLeft();
			super.moveRight();
			super.setbTransponivel(true);
			return true;
			
        }

		return true;
			
	}
	
	

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
