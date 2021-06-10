package Modelo;

import java.util.ArrayList;

import Controler.ControleDeJogo;

public class BlocoVerdePrisma extends BlocoAnimado {

	private static final long serialVersionUID = 1L;

	public BlocoVerdePrisma(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bDestrutivel = true;
	}

	@Override
	public void contatoComAtaque(ArrayList<Elemento> ListElem, Orientacao orientacao, int index) {
		ControleDeJogo cControle = new ControleDeJogo();

		switch (orientacao) {
		case CIMA:
			if (!this.moveUp() || !cControle.ehPosicaoValida(ListElem, this.getPosicao(), index)) {
				ListElem.remove(this);
			}else {
				this.voltaAUltimaPosicao();
			}
			break;

		case DIREITA:
			if (!this.moveRight() || !cControle.ehPosicaoValida(ListElem, this.getPosicao(), index)) {
				ListElem.remove(this);
			}else {
				this.voltaAUltimaPosicao();
			}
			break;

		case BAIXO:
			if (!this.moveDown() || !cControle.ehPosicaoValida(ListElem, this.getPosicao(), index)) {
				ListElem.remove(this);
			}else {
				this.voltaAUltimaPosicao();
			}
			break;

		case ESQUERDA:
			if (!this.moveLeft() || !cControle.ehPosicaoValida(ListElem, this.getPosicao(), index)) {
				ListElem.remove(this);
			}else {
				this.voltaAUltimaPosicao();
			}
			break;
		}
	}

}
