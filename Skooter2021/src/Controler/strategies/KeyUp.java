package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Animado;
import Modelo.Elemento;
import Modelo.Hero;

public class KeyUp implements Key{

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Animado heroi, Tela tela) {
		((Hero)eElementos.get(0)).moveUp();
		((Hero)eElementos.get(0)).setImage("skooter_hero_up.png");
	}
	
}
