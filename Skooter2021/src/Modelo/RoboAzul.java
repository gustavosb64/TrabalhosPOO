package Modelo;

import java.util.ArrayList;

public class RoboAzul extends Robo{

	private static final long serialVersionUID = 1L;
	
	protected RoboAzul(String sNomeImagePNG) {
		super(sNomeImagePNG);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move() {
		return false;
	}

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }
}
