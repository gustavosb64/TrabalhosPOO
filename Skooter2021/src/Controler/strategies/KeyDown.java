package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Animado;
import Modelo.Elemento;
import Modelo.Hero;

public class KeyDown implements Key {

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Animado heroi, Tela tela) {
		((Hero)eElementos.get(0)).moveDown();
		((Hero)eElementos.get(0)).setImage("skooter_hero_down.png");
	}

}
