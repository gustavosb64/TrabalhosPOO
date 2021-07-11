package Modelo;

public class BlocoBase extends Animado implements Bloco{

	private static final long serialVersionUID = -2689628702459093370L;
	
	public BlocoBase(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = false;
	}	

}
