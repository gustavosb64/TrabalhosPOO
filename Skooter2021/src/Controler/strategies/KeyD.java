package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Animado;
import Modelo.Elemento;
import Modelo.Hero2;

public class KeyD implements Key{
	

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Animado heroi, Tela tela) {
		((Hero2)eElementos.get(1)).moveRight();
		((Hero2)eElementos.get(1)).setImage("skooter_hero_right.png");
	}

}
