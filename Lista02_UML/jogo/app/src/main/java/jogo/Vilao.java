package jogo;

public class Vilao extends Personagem{
	
	public Vilao(String nome, int vida, Categoria categoria) {
		super(nome, vida, categoria);
	}
	
	public Vilao(String nome, int vida, Superpoder superpoder, Categoria categoria) {
		super(nome, vida, superpoder, categoria);
	}
	
}
