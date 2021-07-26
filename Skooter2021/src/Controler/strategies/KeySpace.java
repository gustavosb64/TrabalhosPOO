package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Animado;
import Modelo.Elemento;
import Modelo.Hero;

public class KeySpace implements Key {

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Animado heroi, Tela tela) {
		((Hero) heroi).ataque(eElementos); 
	}

}
