package Modelo;

import java.util.ArrayList;

import Auxiliar.Posicao;

public class BlocoAnimado extends Animado {
	private static final long serialVersionUID = 1L;

	protected boolean bDestrutivel;
	
	public BlocoAnimado(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = false;
		super.bMovel = true;
		this.bDestrutivel = false;
	}
	
	public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e) {
        Posicao p = hHeroi.getPosicao();
		if(p.getColunaAnterior() != p.getColuna()) {
			boolean a = (p.getColunaAnterior() < p.getColuna()) ? super.moveRight() : super.moveLeft();
			return a;
		}
		if(p.getLinhaAnterior() != p.getLinha()) {
			boolean a = (p.getLinhaAnterior() < p.getLinha()) ? super.moveDown() : super.moveUp();
			return a;
		}
		return false;	
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
