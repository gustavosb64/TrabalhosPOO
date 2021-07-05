package bridge;

import java.util.ArrayList;
import java.util.List;

public class ConjuntosDiferenca implements ConjuntosFunction{

	@Override
	public List<Integer> fazOperacao(MeusVetores conjuntos) {
		System.out.println("Conjunto 1: " + conjuntos.getConjunto1());
		System.out.println("Conjunto 2: " + conjuntos.getConjunto2());
		List<Integer> listaDiferenca = new ArrayList<Integer>();
		for (Integer elemento : conjuntos.getConjunto1()) {
			if(!conjuntos.getConjunto2().contains(elemento))
				listaDiferenca.add(elemento);
		}
		
		System.out.println("Diferença dos conjuntos: " + listaDiferenca);
		return listaDiferenca;
	}

}
