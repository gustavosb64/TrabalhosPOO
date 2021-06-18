package Modelo;

import java.util.ArrayList;

import Auxiliar.Desenhador;

public class Fruta extends Elemento{
	
	private static final long serialVersionUID = 1L;

	public Fruta(String sNomeImagePNG) {
		super(sNomeImagePNG);
		super.bTransponivel = true;
	}

	@Override
	public void contatoTransponivel(ArrayList<Elemento> listaElementos) {
       super.contatoTransponivel(listaElementos);
    }
	
}
