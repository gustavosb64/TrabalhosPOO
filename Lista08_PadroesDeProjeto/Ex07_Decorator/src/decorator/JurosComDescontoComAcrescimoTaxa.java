package decorator;

public class JurosComDescontoComAcrescimoTaxa extends DividaDecorator{
	
	public static final double MULTA = 20.0;
	private int mesesAtraso;
	private double taxa;
	private double desconto;
	
	public JurosComDescontoComAcrescimoTaxa(Divida divida, int mesesAtraso, double desconto, double taxa) {
		super(divida);
		this.mesesAtraso = mesesAtraso;
		this.taxa = taxa;
		this.desconto = desconto;
	}
	
	@Override
	public void exibeDivida() {
		System.out.printf("A sua divida é equivalente a: %.2f\n", ((super.getValorDivida() + (this.mesesAtraso * MULTA)) + this.taxa) - this.desconto);		
	}

}
