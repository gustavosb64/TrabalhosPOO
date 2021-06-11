package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

import Auxiliar.Posicao;

@SuppressWarnings("serial")
public class Hero extends Animado implements Serializable {
	public Hero(String sNomeImagePNG) {
		super(sNomeImagePNG);
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e) {
		return true;
	}

	public boolean ataque(ArrayList<Elemento> listaElementos) {
		System.out.println("Entrei ");
		Posicao posicao = new Posicao(0, 0);
		Elemento elementoTemp;
		switch (super.orientacao) {
		    case CIMA:
			    posicao.setPosicao(this.getPosicao().getLinha() - 1, this.getPosicao().getColuna());
			    break;

		    case BAIXO:
			    posicao.setPosicao(this.getPosicao().getLinha() + 1, this.getPosicao().getColuna());
			    break;

		    case ESQUERDA:
			    posicao.setPosicao(this.getPosicao().getLinha(), this.getPosicao().getColuna() - 1);
			    break;

		    case DIREITA:
			    posicao.setPosicao(this.getPosicao().getLinha() - 1, this.getPosicao().getColuna() + 1);
			    break;
		}
		
		for(int i = 1; i < listaElementos.size(); i++) {
			elementoTemp = listaElementos.get(i);           
			if(elementoTemp.getPosicao().estaNaMesmaPosicao(posicao)) {
				System.out.println("Apertei");
				elementoTemp.contatoComAtaque(listaElementos, this.orientacao, i);
			}
		}
		
		
		return true;
	}
}
