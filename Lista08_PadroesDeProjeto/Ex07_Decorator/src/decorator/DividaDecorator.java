package decorator;

public class DividaDecorator implements Divida{
	
	private Divida divida;
	
	public DividaDecorator(Divida divida) {
		this.divida = divida;
	}

	public void exibeDivida() {
		divida.exibeDivida();
	}

	@Override
	public double getValorDivida() {
		return divida.getValorDivida();
	}
}
