package polinomios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Polinomio {
	private int grauMax;	
	ArrayList <Termo> listaTermos = new ArrayList();
	
	public Polinomio(int grau) {
		this.grauMax = grau;
	}
	
	public void add(Termo termo) {
		if(termo.getGrauTermo() > this.grauMax) {
			System.out.println("Grau inserido excede o grau máximo suportado");
			return;
		}
		
		int indice = listaTermos.indexOf(termo);
		if(indice != -1) {
			double resultado = listaTermos.get(indice).getCoeficiente() + termo.getCoeficiente();
			listaTermos.get(indice).setCoeficiente(resultado);
		}else {
			listaTermos.add(termo);
		}
		Collections.sort(listaTermos, Comparator.comparing(Termo::getGrauTermo));
		Collections.reverse(listaTermos);
		return;
	}

	public List<Termo> getListaTermos() {
		return listaTermos;
	}
	
	public void imprimirPolinomio(){
		for(int i = 0; i < this.listaTermos.size(); i++) {
			System.out.printf("%.1f*x^%d", this.getListaTermos().get(i).getCoeficiente(), this.getListaTermos().get(i).getGrauTermo());
			if(i < this.listaTermos.size() - 1) {
				System.out.printf(" + ");
			}else {
				System.out.println();
			}
		}
	}
	
	public double calcularPolinomio(double x) {
		double resultado = 0;
		double a;
		int n;
		for(int i = 0; i < listaTermos.size(); i++) {
			a = getListaTermos().get(i).getCoeficiente();
			n = getListaTermos().get(i).getGrauTermo();
			resultado += a * Math.pow(x, n);
		}
		return resultado;
	}
	
}
