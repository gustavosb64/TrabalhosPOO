package Modelo;

import java.util.ArrayList;

public class BlocoVermelhoLiso extends Elemento{

	private static final long serialVersionUID = 1L;

	public BlocoVermelhoLiso(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = false;
	}

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }
}
