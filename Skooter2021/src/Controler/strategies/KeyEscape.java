package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Elemento;
import Modelo.Hero;

public class KeyEscape implements Key {

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Hero heroi, Tela tela) {
		System.exit(0);

	}

}
