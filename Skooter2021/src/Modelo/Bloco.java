package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public interface Bloco extends Serializable{
	
	public void contatoComAtaque(ArrayList<Elemento> ListElem, Orientacao orientacao, int index);
	public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e);

}
