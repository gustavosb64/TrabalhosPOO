package bridge;

import java.util.ArrayList;
import java.util.List;

public class ConjuntosUniao implements ConjuntosFunction{

	@Override
	public List<Integer> fazOperacao(MeusVetores conjuntos) {
		System.out.println("Conjunto 1: " + conjuntos.getConjunto1());
		System.out.println("Conjunto 2: " + conjuntos.getConjunto2());
		List<Integer> listaUniao = new ArrayList<Integer>();
		for (Integer elemento : conjuntos.getConjunto1()) {
			listaUniao.add(elemento);
		}
		
		for (Integer elemento : conjuntos.getConjunto2()) {
			if(!listaUniao.contains(elemento))
				listaUniao.add(elemento);
		}
		
		listaUniao.sort((n1, n2) -> Integer.compare(n1, n2));
		
		System.out.println("Conjunto União: " + listaUniao);
		return listaUniao;
	}
	
}
