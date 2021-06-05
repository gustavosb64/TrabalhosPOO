package Modelo;

import java.util.ArrayList;

public class BlocoEstatico extends Elemento{

	private static final long serialVersionUID = 1L;

	public BlocoEstatico(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = false;
		// TODO Auto-generated constructor stub
	}

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }
}
