package Modelo;

import Auxiliar.Posicao;

public class BlocoAnimado extends Animado {
	private static final long serialVersionUID = 1L;

	public BlocoAnimado(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = true;
	}
	
	public boolean move(Posicao p) {
		if(p.getColunaAnterior() != p.getColuna()) {
			boolean a = (p.getColunaAnterior() < p.getColuna()) ? super.moveRight() : super.moveLeft();
			return true;
		}
		if(p.getLinhaAnterior() != p.getLinha()) {
			boolean a = (p.getLinhaAnterior() < p.getLinha()) ? super.moveDown() : super.moveUp();
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
