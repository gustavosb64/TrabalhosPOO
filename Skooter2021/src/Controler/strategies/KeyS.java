package Controler.strategies;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Controler.Tela;
import Modelo.Animado;
import Modelo.Elemento;

public class KeyS implements Key {

	@Override
	public void pressed(ArrayList<Elemento> eElementos, Animado heroi, Tela tela) {
		try {
			ObjectOutputStream objectOutput = new ObjectOutputStream(
					new FileOutputStream("." + File.separator + "save" + File.separator + "save.zip"));
			objectOutput.writeObject(eElementos);
			objectOutput.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
