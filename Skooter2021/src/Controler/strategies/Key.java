package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Elemento;
import Modelo.Hero;

public interface Key {
	
	public void pressed(ArrayList<Elemento> eElementos, Hero heroi, Tela tela);

}
