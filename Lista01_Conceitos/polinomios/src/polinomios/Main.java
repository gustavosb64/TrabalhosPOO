package polinomios;

public class Main {
	public static void main(String[] args) {
		Polinomio polinomio = new Polinomio(4);
		polinomio.add(new Termo(2, 3));
		polinomio.add(new Termo(3, 2));
		polinomio.add(new Termo(4, 1)); 

		polinomio.imprimirPolinomio();
		System.out.println(polinomio.calcularPolinomio(2));
	}
}
