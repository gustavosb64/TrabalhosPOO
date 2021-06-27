package threads;

public class Main {
	
	public static void main(String[] args) {
		Long numeroOperacoes = 10000000L;
		
		System.out.println("Operação de raiz quadrada\n");
		ThreadRaizQuadrada threadUnicaRaiz = new ThreadRaizQuadrada(numeroOperacoes);
		
		long tempoInicio = System.currentTimeMillis();
		
		threadUnicaRaiz.start();
		try {
			threadUnicaRaiz.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		long tempoTotal = System.currentTimeMillis() - tempoInicio;
		System.out.println("Tempo com 1 thread: " + tempoTotal / 1000 + " segundos");
		
		int numeroNucleos = Runtime.getRuntime().availableProcessors();
		
		ThreadRaizQuadrada[] vetorThreadsRaiz = new ThreadRaizQuadrada[numeroNucleos];
		
		tempoInicio = System.currentTimeMillis();
		
		try {
			for(int i = 0; i < numeroNucleos; i++) {
				vetorThreadsRaiz[i] = new ThreadRaizQuadrada(numeroOperacoes / numeroNucleos);
				vetorThreadsRaiz[i].start();
			}
			
			for(int i = 0; i < numeroNucleos; i++) {
				vetorThreadsRaiz[i].join();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		tempoTotal = System.currentTimeMillis() - tempoInicio;
		System.out.println("Tempo com " + numeroNucleos + " threads: " + tempoTotal / 1000 + " segundos");
		
		
		System.out.println("\nOperações de raiz quadrada, potencia e cosseno\n");
		
		ThreadCosseno threadUnicaCosseno = new ThreadCosseno(numeroOperacoes);
		
		tempoInicio = System.currentTimeMillis();
		
		threadUnicaCosseno.start();
		try {
			threadUnicaCosseno.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		tempoTotal = System.currentTimeMillis() - tempoInicio;
		System.out.println("Tempo com 1 thread: " + tempoTotal / 1000 + " segundos");
		
		ThreadCosseno[] vetorThreadsCosseno = new ThreadCosseno[numeroNucleos];
		
		tempoInicio = System.currentTimeMillis();
		
		try {
			for(int i = 0; i < numeroNucleos; i++) {
				vetorThreadsCosseno[i] = new ThreadCosseno(numeroOperacoes / numeroNucleos);
				vetorThreadsCosseno[i].start();
			}
			
			for(int i = 0; i < numeroNucleos; i++) {
				vetorThreadsCosseno[i].join();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		tempoTotal = System.currentTimeMillis() - tempoInicio;
		System.out.println("Tempo com " + numeroNucleos + " threads: " + tempoTotal / 1000 + " segundos");
		
		
	}

}
