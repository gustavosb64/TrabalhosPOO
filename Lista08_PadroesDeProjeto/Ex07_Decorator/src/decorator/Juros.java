package decorator;

public class Juros extends DividaDecorator{

	private int mesesAtraso;
	public static final double MULTA = 20.0;
	
	public Juros(Divida divida, int mesesAtraso) {
		super(divida);
		this.mesesAtraso = mesesAtraso;
		this.
	}

	@Override
	public void exibeDivida() {
		System.out.printf("A sua divida é equivalente a: %.2f\n", super.getValorDivida() + (MULTA * mesesAtraso));		
	}

}
