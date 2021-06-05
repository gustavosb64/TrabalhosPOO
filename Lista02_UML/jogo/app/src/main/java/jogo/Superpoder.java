package jogo;

public class Superpoder {
	
	private String nome;
	private int intensidadeAtaque;
	private Categoria categoria;
	private Estilo estilo;
	
	public Superpoder(String nome, int intensidadeAtaque, Categoria categoria, Estilo estilo) {
		this.nome = nome;
        this.intensidadeAtaque = intensidadeAtaque;
		this.categoria = categoria;
		this.estilo = estilo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

    public int getIntensidadeAtaque() {
        return intensidadeAtaque;
    }

    public void setIntensidadeAtaque(int intensidadeAtaque) {
        this.intensidadeAtaque = intensidadeAtaque;
    }

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	@Override
	public boolean equals(Object o) {
		if(this.getNome() == ((Superpoder) o).getNome()) {
			return true;
		}
		return false;
	}
}
