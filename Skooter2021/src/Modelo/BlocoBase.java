package Modelo;

import java.util.ArrayList;

public class BlocoBase extends Animado implements Bloco{

	private static final long serialVersionUID = -2689628702459093370L;
	
	public BlocoBase(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = false;
	}	
	
	public void contatoComAtaque(ArrayList<Elemento> ListElem, Orientacao orientacao, int index) {}
	public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e) {
		return false;
	}

}
