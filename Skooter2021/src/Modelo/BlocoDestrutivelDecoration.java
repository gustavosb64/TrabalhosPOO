package Modelo;

import java.util.ArrayList;

public class BlocoDestrutivelDecoration extends BlocoDecorator{

	private static final long serialVersionUID = 22598089938896925L;

	public BlocoDestrutivelDecoration(String imagem, Bloco bloco) {
		super(imagem, bloco);
	}

	@Override
	public void contatoComAtaque(ArrayList<Elemento> ListElem, Orientacao orientacao, int index) {
		ListElem.remove(this);
	}
	
}
