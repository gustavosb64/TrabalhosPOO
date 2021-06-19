package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

import Auxiliar.Posicao;

@SuppressWarnings("serial")
public class Hero extends Animado implements Serializable {
    private int iVidas;

	public Hero(String sNomeImagePNG) {
		super(sNomeImagePNG);
        this.iVidas = 2;
	}

	//Esse método é chamado quando a tecla "espaço" é pressionada.
	public boolean ataque(ArrayList<Elemento> listaElementos) {
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
			    posicao.setPosicao(this.getPosicao().getLinha(), this.getPosicao().getColuna() + 1);
			    break;
		}
		
		//Verifica se existe algum elemento no alcance do ataque do heroi.
		for(int i = 1; i < listaElementos.size(); i++) {
			elementoTemp = listaElementos.get(i);           
			if(elementoTemp.getPosicao().estaNaMesmaPosicao(posicao)) {
				elementoTemp.contatoComAtaque(listaElementos, this.orientacao, i);
			}
		}
		
		return true;
	}

    public int getIVidas(){
        return this.iVidas;
    }

    public void setIVidas(int vida){
        this.iVidas = vida;
    }
   
}
