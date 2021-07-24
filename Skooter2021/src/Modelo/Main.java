package Modelo;

import Controler.Tela;

public class Main {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				Tela tTela = null;
				try {
					tTela = new Tela();
					tTela.setVisible(true);
					tTela.createBufferStrategy(2);
					tTela.go();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
