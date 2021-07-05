package bridge;

import java.util.ArrayList;
import java.util.List;

public class MeusVetores {
	
	private List<Integer> conjunto1 = new ArrayList<Integer>();
	private List<Integer> conjunto2 = new ArrayList<Integer>();
	
	public MeusVetores(List<Integer> conjunto1, List<Integer> conjunto2) {
		this.conjunto1 = conjunto1;
		this.conjunto2 = conjunto2;
	}
	
	public List<Integer> getConjunto1() {
		return conjunto1;
	}
	public void setConjunto1(List<Integer> conjunto1) {
		this.conjunto1 = conjunto1;
	}
	public List<Integer> getConjunto2() {
		return conjunto2;
	}
	public void setConjunto2(List<Integer> conjunto2) {
		this.conjunto2 = conjunto2;
	}
	
	public List<Integer> realizaOperacao(ConjuntosFunction conjuntos){
		return conjuntos.fazOperacao(this);
	}

}
