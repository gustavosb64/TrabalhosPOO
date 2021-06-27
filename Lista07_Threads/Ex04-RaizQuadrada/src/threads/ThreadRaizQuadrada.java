package threads;

import java.util.Random;

public class ThreadRaizQuadrada extends Thread{

	private Long numeroOperacoes;
	
	public ThreadRaizQuadrada(Long numeroOperacoes) {
		this.numeroOperacoes = numeroOperacoes;
	}
	
	public void run() {
		Random aleatorio = new Random();
		
		for(int i = 0; i < numeroOperacoes; i++)
			Math.sqrt(aleatorio.nextDouble());
	}
	
}
