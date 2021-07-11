package Modelo;

import java.io.Serializable;

public abstract class BlocoDecorator extends BlocoBase implements Bloco, Serializable{

	private static final long serialVersionUID = -8947067361971797893L;
	
	protected Bloco bloco;
	
	public BlocoDecorator(String imagem, Bloco bloco) {
		super(imagem);
		this.bloco = bloco;
	}

	public Bloco getBloco() {
		return bloco;
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}

}
