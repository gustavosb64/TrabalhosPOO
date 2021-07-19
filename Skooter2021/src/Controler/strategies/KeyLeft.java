package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Elemento;
import Modelo.Hero;

public class KeyLeft implements Key {

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Hero heroi, Tela tela) {
		heroi.moveLeft();
		heroi.setImage("skooter_hero_left.png");

	}

}
