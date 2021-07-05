package bridge;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> conjunto1 = new ArrayList<Integer>();
		List<Integer> conjunto2 = new ArrayList<Integer>();
		
		for(int i = 0; i <= 10; i++) {
			//if(i % 2 == 0)
				conjunto1.add(i);
			if(i % 2 == 1)
				conjunto2.add(i);
		}
		
		MeusVetores meusVetores = new MeusVetores(conjunto1, conjunto2);
		meusVetores.realizaOperacao(new ConjuntosInterseccao());
		
		System.out.println("--------------------------------");
		
		MeusVetores meusVetores2 = new MeusVetores(conjunto1, conjunto2);
		meusVetores2.realizaOperacao(new ConjuntosUniao());
		
		System.out.println("--------------------------------");
		
		MeusVetores meusVetores3 = new MeusVetores(conjunto1, conjunto2);
		meusVetores3.realizaOperacao(new ConjuntosDiferenca());
		
	}

}
