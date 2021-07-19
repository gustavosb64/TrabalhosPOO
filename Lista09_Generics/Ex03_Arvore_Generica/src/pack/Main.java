package pack;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		ArvoreGenerica<Integer> arvore = new ArvoreGenerica<Integer>(null);
		
		
		for(int i = 0; i < 10; i++) {
			arvore.adicionar(random.nextInt(100));
		}
		arvore.emOrdem(arvore.getRaiz());
	}

}
