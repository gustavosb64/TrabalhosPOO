package Controler.strategies;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Controler.Tela;
import Modelo.Elemento;
import Modelo.Hero;

public class KeyL implements Key {

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Hero heroi, Tela tela) {
		try {
			ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("."+File.separator+"save"+File.separator+"save.zip"));
			tela.setElementos((ArrayList<Elemento>) objectInput.readObject());
			tela.setHero((Hero) tela.getElementos().get(0)); 
			objectInput.close();
		} catch (IOException | ClassNotFoundException e1) {
			e1.printStackTrace();
		} 

	}

}
