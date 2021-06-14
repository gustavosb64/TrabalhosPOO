package Controler;

import java.util.ArrayList;

import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import Modelo.Animado;
import Modelo.Elemento;
import Modelo.Fruta;
import Modelo.Hero;

public class ControleDeJogo {
	public void desenhaTudo(ArrayList<Elemento> ListElem) {
		for (int i = ListElem.size()-1; i >= 0; i--) {
			ListElem.get(i).autoDesenho(ListElem, i);
		}
	}

	public void processaTudo(ArrayList<Elemento> e) {
		Hero hHero = (Hero) e.get(0); /* O heroi (protagonista) eh sempre o primeiro do array */
		Elemento eTemp;
		boolean temFruta = false;

		/* Processa todos os demais em relacao ao heroi */
		for (int i = 1; i < e.size(); i++) {
			eTemp = e.get(i); /* Pega o i-esimo elemento do jogo */
			if(eTemp.getClass().getSimpleName().equals("Fruta"))
				temFruta = true;
			/* Verifica se o heroi se sobrepoe ao i-ésimo elemento */
			if (hHero.getPosicao().estaNaMesmaPosicao(eTemp.getPosicao())) {
				if (eTemp.isbTransponivel() == true) {
                    eTemp.contatoTransponivel(e);
				}
			}
		}
		
		if(!temFruta) {
			e.clear();
        	Desenhador.getTelaDoJogo().setFase(new Fase().CriaFase2());
		}
	}

	public boolean ehPosicaoValida(ArrayList<Elemento> e, Posicao p, int index) {
		Elemento eTemp;
		/* Validacao da posicao de todos os elementos com relacao a Posicao p */
		for (int i = 1; i < e.size(); i++) { // Olha todos os elementos
			if (index != i) {
				eTemp = e.get(i); // Pega o i-esimo elemento do jogo
				if (!eTemp.isbTransponivel()) {
					if (eTemp.getPosicao().estaNaMesmaPosicao(p)) {
						if (index == 0 && eTemp.isMovel() == true) {
							if(eTemp.contactHero((Animado) e.get(0), e)) {
								if (!ehPosicaoValida(e, eTemp.getPosicao(), i)) {
									eTemp.voltaAUltimaPosicao();
									return false;
								} else return true;
							} else return false;
						}
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean ehPosicaoValidaSeta(ArrayList<Elemento> e, Posicao p, int index) {
		Elemento eTemp;
		/* Validacao da posicao de todos os elementos com relacao a Posicao p */
		for (int i = 1; i < e.size(); i++) { // Olha todos os elementos
			if (index != i) {
				eTemp = e.get(i); // Pega o i-esimo elemento do jogo
				if (!eTemp.isbTransponivel()) {
					if (eTemp.getPosicao().estaNaMesmaPosicao(p)) {
						return false;
                    }
				}
			}
		}
		return true;
	}

}
