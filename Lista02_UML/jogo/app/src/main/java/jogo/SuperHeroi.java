package jogo;

public class SuperHeroi extends Personagem{

	public SuperHeroi(String nome, int vida, Categoria categoria) {
		super(nome, vida, categoria);
	}
	
	public SuperHeroi(String nome, int vida, Superpoder superpoder, Categoria categoria) {
		super(nome, vida, superpoder, categoria);
	}
	
}
