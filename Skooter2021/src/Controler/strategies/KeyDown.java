package Controler.strategies;

import java.util.ArrayList;

import Controler.Fase;
import Controler.Tela;
import Modelo.Elemento;
import Modelo.Hero;

public class KeyDown implements Key {

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Hero heroi, Tela tela) {
		heroi.moveDown();
		heroi.setImage("skooter_hero_down.png");
	}

}
