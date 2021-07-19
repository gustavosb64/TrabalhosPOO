package decorator;

public class Main {
	
	public static void main(String[] args) {
		Divida divida = new DividaBase(10);
		divida.exibeDivida();
		
		divida = new Juros(divida, 2);
		divida.exibeDivida();
		divida = new JurosComDesconto(divida, 4, 30);
		divida.exibeDivida();
		
		System.out.println("--------------------------------");
		
		
		
		
		System.out.println("--------------------------------");
		
		divida = new DividaBase(30);
		divida.exibeDivida();
		divida = new JurosComDescontoComAcrescimoTaxa(divida, 2, 60, 10);
		divida.exibeDivida();
	}

}
