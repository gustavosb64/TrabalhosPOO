package Controler;

import java.io.Serializable;
import java.util.ArrayList;

import Modelo.Bloco;
import Modelo.BlocoBase;
import Modelo.BlocoDestrutivelDecoration;
import Modelo.BlocoMovelDecoration;
import Modelo.BlocoVerdeLiso;
import Modelo.Coracao;
import Modelo.Elemento;
import Modelo.Fruta;
import Modelo.Hero;
import Modelo.Orientacao;
import Modelo.Robo;
import Modelo.Seta;

public class Fase extends ArrayList<Elemento> implements Serializable {

	private static final long serialVersionUID = -3265424110410076503L;

	public Fase CriaFase1() {
		Hero hero = Hero.getHero();
		hero.setPosicao(6, 4);
		this.add(hero);

		criaFruta(0, 0, "fruta_banana.png");
		criaFruta(10, 10, "fruta_banana.png");
		criaFruta(0, 10, "fruta_morango.png");
		criaFruta(10, 0, "fruta_morango.png");

		for (int i = 1; i < 10; i += 2) {
			for (int j = 1; j < 10; j += 2) {
				criaBlocoVermelhoLiso(i, j);
			}
		}

		criaBlocoVerdePrisma(0, 1);
		criaBlocoVerdePrisma(0, 5);
		criaBlocoVerdePrisma(1, 2);
		criaBlocoVerdePrisma(1, 8);
		criaBlocoVerdePrisma(1, 10);
		criaBlocoVerdePrisma(2, 1);
		criaBlocoVerdePrisma(2, 5);
		criaBlocoVerdePrisma(3, 0);
		criaBlocoVerdePrisma(3, 8);
		criaBlocoVerdePrisma(4, 1);
		criaBlocoVerdePrisma(4, 9);
		criaBlocoVerdePrisma(5, 2);
		criaBlocoVerdePrisma(5, 6);
		criaBlocoVerdePrisma(6, 5);
		criaBlocoVerdePrisma(6, 7);
		criaBlocoVerdePrisma(7, 10);
		criaBlocoVerdePrisma(8, 3);
		criaBlocoVerdePrisma(8, 9);
		criaBlocoVerdePrisma(9, 0);
		criaBlocoVerdePrisma(9, 2);
		criaBlocoVerdePrisma(9, 6);
		criaBlocoVerdePrisma(9, 8);
		criaBlocoVerdePrisma(10, 7);

		criaRobo(0, 2, "robo_amarelo.png");
		criaRobo(10, 1, "robo_azul.png");
		criaRobo(2, 6, "robo_azul.png");
		criaRobo(8, 10, "robo_azul.png");

		return this;
	}

	public Fase CriaFase2() {

		Hero hHero = Hero.getHero(); /* https://www.online-image-editor.com/ */
		hHero.setPosicao(0, 7);
		this.add(hHero);

		criaFruta(1, 5, "fruta_banana.png");
		criaFruta(9, 5, "fruta_morango.png");
		criaFruta(5, 1, "fruta_banana.png");

		for (int i = 1; i < 10; i += 2) {
			for (int j = 3; j < 8; j += 4) {
				criaBlocoVermelhoLiso(i, j);
			}
		}

		for (int i = 3; i < 8; i += 4) {
			for (int j = 1; j < 10; j += 4) {
				criaBlocoVermelhoLiso(i, j);
			}
		}

		criaRobo(1, 1, "robo_amarelo.png");
		criaRobo(9, 1, "robo_azul.png");
		criaRobo(9, 9, "robo_amarelo.png");
		criaCoracao(10, 8);

		Seta seta;
		for (int i = 3; i < 8; i++) {
			seta = new Seta("seta_cima.png", Orientacao.CIMA);
			seta.setPosicao(i, 0);
			this.add(seta);
		}

		Seta seta0_3 = new Seta("seta_direita.png", Orientacao.DIREITA);
		seta0_3.setPosicao(0, 3);
		this.add(seta0_3);

		Seta seta0_7 = new Seta("seta_direita.png", Orientacao.DIREITA);
		seta0_7.setPosicao(0, 7);
		this.add(seta0_7);

		Seta seta2_3 = new Seta("seta_direita.png", Orientacao.DIREITA);
		seta2_3.setPosicao(2, 3);
		this.add(seta2_3);

		Seta seta2_4 = new Seta("seta_baixo", Orientacao.BAIXO);
		seta2_4.setPosicao(2, 4);
		this.add(seta2_4);

		Seta seta3_4 = new Seta("seta_baixo", Orientacao.BAIXO);
		seta3_4.setPosicao(3, 4);
		this.add(seta3_4);

		for (int i = 5; i < 8; i++) {
			seta = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
			seta.setPosicao(2, i);
			this.add(seta);
		}

		Seta seta3_6 = new Seta("seta_cima.png", Orientacao.CIMA);
		seta3_6.setPosicao(3, 6);
		this.add(seta3_6);

		Seta seta3_2 = new Seta("seta_baixo", Orientacao.BAIXO);
		seta3_2.setPosicao(3, 2);
		this.add(seta3_2);

		Seta seta3_8 = new Seta("seta_cima.png", Orientacao.CIMA);
		seta3_8.setPosicao(3, 8);
		this.add(seta3_8);

		Seta seta3_10 = new Seta("seta_baixo", Orientacao.BAIXO);
		seta3_10.setPosicao(3, 10);
		this.add(seta3_10);

		Seta seta4_10 = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
		seta4_10.setPosicao(4, 10);
		this.add(seta4_10);

		Seta seta4_9 = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
		seta4_9.setPosicao(4, 9);
		this.add(seta4_9);

		Seta seta4_8 = new Seta("seta_cima.png", Orientacao.CIMA);
		seta4_8.setPosicao(4, 8);
		this.add(seta4_8);

		Seta seta4_7 = new Seta("seta_direita.png", Orientacao.DIREITA);
		seta4_7.setPosicao(4, 7);
		this.add(seta4_7);

		Seta seta6_3 = new Seta("seta_direita.png", Orientacao.DIREITA);
		seta6_3.setPosicao(6, 3);
		this.add(seta6_3);

		Seta seta6_7 = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
		seta6_7.setPosicao(6, 7);
		this.add(seta6_7);

		Seta seta7_2 = new Seta("seta_baixo", Orientacao.BAIXO);
		seta7_2.setPosicao(7, 2);
		this.add(seta7_2);

		Seta seta7_4 = new Seta("seta_baixo", Orientacao.BAIXO);
		seta7_4.setPosicao(7, 4);
		this.add(seta7_4);

		for (int i = 6; i < 11; i++) {
			seta = new Seta("seta_cima.png", Orientacao.CIMA);
			seta.setPosicao(7, i);
			this.add(seta);
		}

		for (int i = 3; i < 8; i += 4) {
			seta = new Seta("seta_direita.png", Orientacao.DIREITA);
			seta.setPosicao(8, i);
			this.add(seta);
		}

		for (int i = 3; i < 8; i += 4) {
			seta = new Seta("seta_esquerda.png", Orientacao.ESQUERDA);
			seta.setPosicao(10, i);
			this.add(seta);
		}

		return this;
	}

	public Fase CriaFase3() {

		Hero hHero = Hero.getHero(); /* https://www.online-image-editor.com/ */
		hHero.setPosicao(5, 5);
		this.add(hHero);

		criaFruta(5, 0, "fruta_banana.png");
		criaFruta(5, 2, "fruta_banana.png");
		criaFruta(5, 8, "fruta_banana.png");
		criaFruta(5, 10, "fruta_banana.png");

		criaRobo(0, 5, "robo_amarelo.png");
		criaRobo(2, 5, "robo_azul.png");
		criaRobo(8, 5, "robo_amarelo.png");
		criaRobo(10, 5, "robo_azul.png");

		// Colocando blocos vermelhos com prisma

		for (int i = 1; i < 10; i++) {
			criaBlocoVermelhoPrisma(i, 1);
		}
		for (int i = 1; i < 10; i++) {
			criaBlocoVermelhoPrisma(i, 9);
		}
		for (int i = 2; i < 9; i++) {
			criaBlocoVermelhoPrisma(1, i);
		}
		for (int i = 2; i < 9; i++) {
			criaBlocoVermelhoPrisma(9, i);
		}

		for (int i = 3; i < 8; i++) {
			criaBlocoVermelhoPrisma(3, i);
		}

		for (int i = 3; i < 8; i++) {
			criaBlocoVermelhoPrisma(7, i);
		}
		for (int i = 4; i < 7; i++) {
			criaBlocoVermelhoPrisma(i, 3);
		}

		for (int i = 4; i < 7; i++) {
			criaBlocoVermelhoPrisma(i, 7);
		}

		return this;
	}

	public Fase CriaFase4() {

		Hero hHero = Hero.getHero(); /* https://www.online-image-editor.com/ */
		hHero.setPosicao(4, 5);
		this.add(hHero);
		
		criaBlocoVermelhoLiso(0, 3);
		criaBlocoVermelhoLiso(0, 7);
		criaBlocoVermelhoLiso(1, 0);
		criaBlocoVermelhoLiso(1, 8);	
		criaBlocoVermelhoLiso(2, 5);
		criaBlocoVermelhoLiso(3, 2);
		criaBlocoVermelhoLiso(3, 10);
		criaBlocoVermelhoLiso(5, 2);
		criaBlocoVermelhoLiso(5, 8);
		criaBlocoVermelhoLiso(6, 3);
		criaBlocoVermelhoLiso(7, 0);
		criaBlocoVermelhoLiso(8, 7);
		criaBlocoVermelhoLiso(8, 1);
		criaBlocoVermelhoLiso(8, 10);
		criaBlocoVermelhoLiso(10, 1);

		// Colocando blocos verdes lisos
		BlocoVerdeLiso BVdL;
		for (int i = 1; i < 10; i += 2) {
			for (int j = 1; j < 10; j += 2) {
				criaBlocoVerdeLiso(i, j);
			}
		}
		for (int i = 2; i < 9; i += 2) {
			for (int j = 2; j < 9; j += 2) {
				criaBlocoVerdeLiso(i, j);
			}
		}

		// Colocando robôs
		criaRobo(0, 5, "robo_azul.png");
		criaRobo(10, 5, "robo_amarelo.png");
		criaRobo(5, 0, "robo_azul.png");
		criaRobo(5, 10, "robo_azul.png");
		
		criaFruta(0, 0, "fruta_banana.png");
		criaFruta(10, 0, "fruta_morango.png");
		criaFruta(0, 10, "fruta_cereja.png");
		criaFruta(10, 10, "fruta_banana.png");
		
		return this;
	}

	public Fase getFase() {
		return this;
	}

	private void criaBlocoVermelhoLiso(int linha, int coluna) {
		Bloco blocoVermelhoLiso = new BlocoBase("bloco_vermelho_liso.png");
		((Elemento) blocoVermelhoLiso).setPosicao(linha, coluna);
		this.add((Elemento) blocoVermelhoLiso);
	}

	private void criaBlocoVermelhoPrisma(int linha, int coluna) {
		Bloco blocoVermelhoPrisma = new BlocoMovelDecoration("bloco_vermelho_prisma.png", new BlocoBase(null));
		((Elemento) blocoVermelhoPrisma).setPosicao(linha, coluna);
		this.add((Elemento) blocoVermelhoPrisma);
	}

	private void criaBlocoVerdeLiso(int linha, int coluna) {
		Bloco blocoVerdeLiso = new BlocoDestrutivelDecoration("bloco_verde_liso.png", new BlocoBase(null));
		((Elemento) blocoVerdeLiso).setPosicao(linha, coluna);
		this.add((Elemento) blocoVerdeLiso);
	}

	private void criaBlocoVerdePrisma(int linha, int coluna) {
		Bloco blocoVerdePrisma = new BlocoMovelDecoration("bloco_verde.png",
				new BlocoDestrutivelDecoration(null, new BlocoBase(null)));
		((Elemento) blocoVerdePrisma).setPosicao(linha, coluna);
		this.add((Elemento) blocoVerdePrisma);
	}

	private void criaFruta(int linha, int coluna, String imagem) {
		Fruta fruta = new Fruta(imagem);
		fruta.setPosicao(linha, coluna);
		this.add(fruta);
	}

	private void criaRobo(int linha, int coluna, String imagem) {
		Robo robo = new Robo(imagem);
		robo.setPosicao(linha, coluna);
		this.add(robo);
	}

	private void criaCoracao(int linha, int coluna) {
		Coracao coracao = new Coracao("heart.png");
		coracao.setPosicao(linha, coluna);
		this.add(coracao);
	}

	private void criaSeta(int linha, int coluna, String imagem, Orientacao orientacao) {
		Seta seta = new Seta(imagem, orientacao);
		seta.setPosicao(linha, coluna);
		this.add(seta);
	}

}
