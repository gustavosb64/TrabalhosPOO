package Modelo;

public abstract class Animado extends Elemento {

	private static final long serialVersionUID = 1L;
	
	 protected Animado(String sNomeImagePNG) {
			super(sNomeImagePNG);
			// TODO Auto-generated constructor stub
	}

	
		public boolean moveUp() {
		       return this.pPosicao.moveUp();
		}
		
		public boolean moveDown() {
		       return this.pPosicao.moveDown();
		}

		public boolean moveRight() {
		       return this.pPosicao.moveRight();
		}

		public boolean moveLeft() {
		       return this.pPosicao.moveLeft();
		}
		
		public abstract boolean move();
		
}
