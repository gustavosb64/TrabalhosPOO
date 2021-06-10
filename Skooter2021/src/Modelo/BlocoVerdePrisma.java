package Modelo;

public class BlocoVerdePrisma extends BlocoAnimado{
	
	private static final long serialVersionUID = 1L;

	public BlocoVerdePrisma(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bDestrutivel = true;
	}

}
