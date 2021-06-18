package Modelo;

import java.util.ArrayList;

import Controler.ControleDeJogo;

public class BlocoVerdePrisma extends BlocoVermelhoPrisma {

	private static final long serialVersionUID = 1L;

	public BlocoVerdePrisma(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bDestrutivel = true;
	}

	@Override
	public void contatoComAtaque(ArrayList<Elemento> ListElem, Orientacao orientacao, int index) {
		ControleDeJogo cControle = new ControleDeJogo();
		ListElem.remove(this);
	}

}
