package jogo;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

	private String nome;
	private int vida;
	private List<Superpoder> poderes = new ArrayList<Superpoder>();
	
	public Personagem(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}
	
	public Personagem(String nome, int vida, Superpoder superpoder) {
		this.nome = nome;
		this.vida = vida;
		this.poderes.add(superpoder);
	}
	
	public void adicionarPoder(Superpoder superpoder) {
		this.poderes.add(superpoder);
	}
	
	public void atacar(int intensidadeAtaque, Superpoder poder, Personagem personagem) {
		if(this.poderes.contains(poder)) {
			
			if(Math.random() >= 0.5) {
				personagem.setVida(personagem.getVida() - intensidadeAtaque);
				System.out.println();
				System.out.println(nome +" acertou!");
				System.out.println("Dano causado: " + intensidadeAtaque);
				System.out.println();
				System.out.println("---------------------------------------");
			}else {
				System.out.println(nome + "Errou...");
				System.out.println("Dano causado: 0");
				System.out.println();
				System.out.println("---------------------------------------");
			}
			
		}else {
			System.out.println("Este ataque não existe!");
			System.out.println("Por Favor, insira um ataque válido...");
			System.out.println();
			System.out.println("---------------------------------------");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public List<Superpoder> getPoderes() {
		return poderes;
	}
	
}
