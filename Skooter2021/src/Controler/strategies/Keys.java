package Controler.strategies;
import java.awt.event.KeyEvent;

//Enum com todas as teclas de controle do jogo
public enum Keys {

	VK_UP(KeyEvent.VK_UP) {
		@Override
		public Key obterTecla() {
			return new KeyUp();
		}
	},
	VK_DOWN(KeyEvent.VK_DOWN) {
		@Override
		public Key obterTecla() {
			return new KeyDown();
		}
	},
	VK_LEFT(KeyEvent.VK_LEFT) {
		@Override
		public Key obterTecla() {
			return new KeyLeft();
		}
	},
	VK_RIGHT(KeyEvent.VK_RIGHT) {
		@Override
		public Key obterTecla() {
			return new KeyRight();
		}
	},

	VK_SPACE(KeyEvent.VK_SPACE) {
		@Override
		public Key obterTecla() {
			return new KeySpace();
		}
	}, VK_ESCAPE(KeyEvent.VK_ESCAPE) {
		@Override
		public Key obterTecla() {
			return new KeyEscape();
		}
	}, VK_R(KeyEvent.VK_R) {
		@Override
		public Key obterTecla() {
			return new KeyR();
		}
	}, VK_L(KeyEvent.VK_L) {
		@Override
		public Key obterTecla() {
			return new KeyL();
		}
	}, VK_S(KeyEvent.VK_S) {
		@Override
		public Key obterTecla() {
			return new KeySDown();
		}
	}, VK_W(KeyEvent.VK_W) {
		@Override
		public Key obterTecla() {
			return new KeyW();
		}
	}, VK_A(KeyEvent.VK_A) {
		@Override
		public Key obterTecla() {
			return new KeyA();
		}
	}, VK_D(KeyEvent.VK_D) {
		@Override
		public Key obterTecla() {
			return new KeyD();
		}
	};

	private int code;
	
	Keys(int code){
		this.code = code;
	}
	public int getCode() {
		return this.code;
	}
	
	public abstract Key obterTecla();

}
