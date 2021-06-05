package jogo;

public class Superpoder {
	
		private String nome;
		Categoria categoria;
		
		public Superpoder(String nome, Categoria categoria) {
			this.nome = nome;
			this.categoria = categoria;
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
		
		@Override
		public boolean equals(Object o) {
			if(this.getNome() == ((Superpoder) o).getNome()) {
				return true;
			}
			return false;
		}

}
