package Controler.strategies;

import java.util.ArrayList;

import Controler.Tela;
import Modelo.Animado;
import Modelo.Elemento;

public interface Key {
	
	public void pressed(ArrayList<Elemento> eElementos, Animado heroi, Tela tela);

}
