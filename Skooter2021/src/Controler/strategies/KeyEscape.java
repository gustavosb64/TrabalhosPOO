package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Animado;
import Modelo.Elemento;

public class KeyEscape implements Key {

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Animado heroi, Tela tela) {
		System.exit(0);

	}

}
