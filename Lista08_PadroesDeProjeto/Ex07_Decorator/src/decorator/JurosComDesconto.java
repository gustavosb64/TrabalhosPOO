package decorator;

public class JurosComDesconto extends DividaDecorator{
	
	public static final double MULTA = 20.0;
	private double desconto;
	private int mesesAtraso;
	
	public JurosComDesconto(Divida divida, int mesesAtraso, double desconto) {
		super(divida);
		System.out.println("-----------"+divida.getValorDivida());
		this.mesesAtraso = mesesAtraso;
		this.desconto = desconto;
	}

	@Override
	public void exibeDivida() {
		System.out.printf("A sua divida é equivalente a: %.2f\n", (super.getValorDivida() + (this.mesesAtraso * MULTA)) - this.desconto);		
	}

}
