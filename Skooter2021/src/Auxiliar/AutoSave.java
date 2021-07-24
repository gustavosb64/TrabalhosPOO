package Auxiliar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.TimerTask;



public class AutoSave extends TimerTask implements Runnable{
	
	@Override
	public void run() {
		try {
			ObjectOutputStream objectOutput = new ObjectOutputStream(
					new FileOutputStream("." + File.separator + "save" + File.separator + "save.zip"));
			objectOutput.writeObject(Desenhador.getTelaDoJogo().getElementos());
			objectOutput.close();
		} catch (IOException /*| InterruptedException*/ e1) {
			e1.printStackTrace();
		}
	}

}
