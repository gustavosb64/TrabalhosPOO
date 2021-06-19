package Modelo;

import java.util.ArrayList;

import Auxiliar.Posicao;

public abstract class Animado extends Elemento {

	private static final long serialVersionUID = 1L;
	private Posicao posicaoAnterior;

	protected Animado(String sNomeImagePNG) {
		super(sNomeImagePNG);
		this.posicaoAnterior = this.getPosicao();
		super.orientacao = Orientacao.BAIXO;
	}

	public boolean moveUp() {
		this.posicaoAnterior = this.getPosicao();
		super.orientacao = Orientacao.CIMA;
		return this.pPosicao.moveUp();
	}

	public boolean moveDown() {
		this.posicaoAnterior = this.getPosicao();
		super.orientacao = Orientacao.BAIXO;
		return this.pPosicao.moveDown();
	}

	public boolean moveRight() {
		this.posicaoAnterior = this.getPosicao();
		super.orientacao = Orientacao.DIREITA;
		return this.pPosicao.moveRight();
	}

	public boolean moveLeft() {
		this.posicaoAnterior = this.getPosicao();
		super.orientacao = Orientacao.ESQUERDA;
		return this.pPosicao.moveLeft();
	}
	
	public Orientacao getOrientacao() {
		return super.orientacao;
	}

	public void contatoComAtaque(ArrayList<Elemento> listaElementos, Orientacao orientacao) {
		// TODO Auto-generated method stub
		
	}

}
