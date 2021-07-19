package Controler.strategies;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import Controler.Tela;
import Modelo.Elemento;
import Modelo.Hero;

public class KeyUp implements Key{

	public void pressed(KeyEvent e, Hero heroi) {
		
	}

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Hero heroi, Tela tela) {
		heroi.moveUp();
        heroi.setImage("skooter_hero_up.png");
	}
	
}
