package jogo;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

	private String nome;
	private int vida;
	private List<Superpoder> poderes = new ArrayList<Superpoder>();
	private Categoria categoria;
	private int escudoExtra;
	
	public Personagem(String nome, int vida, Categoria categoria) {
		this.nome = nome;
		this.vida = vida;
		this.categoria = categoria;
		this.escudoExtra = 0;
	}
	
	public Personagem(String nome, int vida, Superpoder superpoder, Categoria categoria) {
		this.nome = nome;
		this.vida = vida;
		this.poderes.add(superpoder);
		this.escudoExtra = 0;
	}
	
	public void adicionarPoder(Superpoder superpoder) {
		this.poderes.add(superpoder);
	}
	
	public void atacar(Superpoder poder, Personagem personagem) {

		if(!this.poderes.contains(poder)) {
            System.out.println(poder.getNome());
			System.out.println(this.nome + " não sabe este ataque!");
			System.out.println("Por Favor, insira um ataque valido...");
            return;
        }

        if (poder.getEstilo() == Estilo.OFENSIVO){

            int intensidadeAtaque = poder.getIntensidadeAtaque();
            double random = Math.random();

            //Caso o personagem atacando tenha a mesma categoria do ataque,
            //probabilidade de acerto aumenta em 0.1
            if (poder.getCategoria() == this.categoria) random += 0.1;

	        System.out.println(nome +" usa " + poder.getNome() + "!");

			if(random >= 0.5) {
                intensidadeAtaque -= personagem.getEscudoExtra();
                if (intensidadeAtaque < 0) intensidadeAtaque = 0;

		    	personagem.setVida(personagem.getVida() - intensidadeAtaque);
			    System.out.println();
   				System.out.println(nome +" acertou!");
    			System.out.println("Dano causado: " + intensidadeAtaque);
                
                personagem.setEscudoExtra(0);
	    	}else {
		    	System.out.println(nome + " errou...");
			    System.out.println("Dano causado: 0");
   			}
        }
        else{
	        System.out.println(nome +" usa " + poder.getNome() + "!");
            this.escudoExtra = poder.getIntensidadeAtaque();
        }

        if(this.vida > 0 && personagem.vida > 0){
			System.out.println();
            System.out.println("Pontos de Vida de " + this.nome + ": " + this.vida);
            System.out.println("Pontos de Vida de " + personagem.nome + ": " + personagem.vida);
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getEscudoExtra() {
        return escudoExtra;
    }

    public void setEscudoExtra(int escudoExtra) {
        this.escudoExtra = escudoExtra;
    }

}
