package threads;

import java.util.Random;

public class ThreadCosseno extends Thread{

	private Long numeroOperacoes;
	
	public ThreadCosseno(Long numeroOperacoes) {
		this.numeroOperacoes = numeroOperacoes;
	}
	
	public void run() {
		Random aleatorio = new Random();
		double resultado;
		
		for(int i = 0; i < numeroOperacoes; i++) {
			resultado = Math.pow(aleatorio.nextDouble(), 2);
			Math.cos(Math.sqrt(resultado));
		}
			
	}
	
}
