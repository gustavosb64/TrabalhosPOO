package Modelo;

import java.util.ArrayList;
import java.util.Random;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Controler.ControleDeJogo;

public class Robo extends Animado {

	private static final long serialVersionUID = 1L;
	private int direction; // 0 = cima; 1 = esquerda; 2 = baixo; 3 = direita
	private int iContaFrames;

	public Robo(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = true;
		this.iContaFrames = 0;
	}

	public void autoDesenho(ArrayList<Elemento> ListElem, int index) {
		ControleDeJogo cControle = new ControleDeJogo();

		// seleção aleatória para a direção do movimento
		Random randGen = new Random();
		this.direction = randGen.nextInt(4);

		this.iContaFrames++;
		if (this.iContaFrames == Consts.TIMER_ROBO) {
			switch (this.direction) {
			case 0:
				if (!this.moveUp() || !cControle.ehPosicaoValida(ListElem, this.getPosicao(), index)) {
					this.voltaAUltimaPosicao();
				}
				break;

			case 1:
				if (!this.moveRight() || !cControle.ehPosicaoValida(ListElem, this.getPosicao(), index)) {
					this.voltaAUltimaPosicao();
				}
				break;

			case 2:
				if (!this.moveDown() || !cControle.ehPosicaoValida(ListElem, this.getPosicao(), index)) {
					this.voltaAUltimaPosicao();
				}
				break;

			case 3:
				if (!this.moveLeft() || !cControle.ehPosicaoValida(ListElem, this.getPosicao(), index)) {
					this.voltaAUltimaPosicao();
				}
				break;
			}

			this.iContaFrames = 0;
		}

		super.autoDesenho(ListElem, index);
	}

	public boolean move() {

		return false;
	}

	public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e) {
		return true;
	}

	@Override
	public void contatoTransponivel(ArrayList<Elemento> listaElementos) {
        listaElementos.clear();
        Desenhador.getTelaDoJogo().setFase();
        return;
    }

}
