package Modelo;

import java.util.ArrayList;

public abstract class Robo extends Animado{

	private static final long serialVersionUID = 1L;
	
	protected Robo(String sNomeImagePNG) {
		super(sNomeImagePNG);
		// TODO Auto-generated constructor stub
	}
	
	public abstract boolean move();
	
    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }
	
	
}
