package Modelo;

import java.util.ArrayList;

import Auxiliar.Posicao;

public class BlocoMovelDecoration extends BlocoDecorator{

	private static final long serialVersionUID = -1292180932176423007L;

	public BlocoMovelDecoration(String imagem, Bloco bloco) {
		super(imagem, bloco);
		super.bMovel = true;
	}
	
	public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e) {
		super.getBloco().contactHero(hHeroi, e);
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
	public void contatoComAtaque(ArrayList<Elemento> ListElem, Orientacao orientacao, int index) {
		bloco.contatoComAtaque(ListElem, orientacao, index);
	}

}
