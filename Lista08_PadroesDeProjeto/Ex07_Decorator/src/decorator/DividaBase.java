package decorator;

public class DividaBase implements Divida{
	
	protected double valor;
	
	public DividaBase(double valor) {
		this.valor = valor;
	}

	@Override
	public void exibeDivida() {
		System.out.printf("A divida é equivalente a: %.2f\n", this.valor);
	}

	@Override
	public double getValorDivida() {
		return this.valor;
	}

}
