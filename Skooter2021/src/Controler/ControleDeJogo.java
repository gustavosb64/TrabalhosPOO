package Controler;

import java.util.ArrayList;

import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import Modelo.Animado;
import Modelo.Elemento;
import Modelo.Fruta;
import Modelo.Hero;

public class ControleDeJogo {
	
	//Lista percorrida do último elemento ao primeiro para heroi sempre sobrepor todos os objetos transponíveis na tela
	public void desenhaTudo(ArrayList<Elemento> ListElem) {
		for (int i = ListElem.size() - 1; i >= 0; i--) {
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
			
			/* Verifica se o heroi se sobrepoe ao i-ésimo elemento */
			if (hHero.getPosicao().estaNaMesmaPosicao(eTemp.getPosicao())) {
				if (eTemp.isbTransponivel() == true) {
					eTemp.contatoTransponivel(e);
				}
			}
		}
		
		//Verifica se ainda há frutas na tela
		for (Elemento elemento : e) {
			if (elemento instanceof Fruta)
				temFruta = true;
		}
		
		//Caso não existam frutas na fase, chama a próxima fase.
		if (!temFruta) {
			Desenhador.getTelaDoJogo().setProximaFase();
		}
	}


    //Função usada por ehPosicaoValida
	private boolean ehPosicaoValidaHeroi(ArrayList<Elemento> e, Elemento eTemp, int i) {

        //Caso o eTemp seja um bloco móvel:
		if (eTemp.isMovel() == true) {
			if (eTemp.contactHero((Animado) e.get(0), e)) {
				if (!ehPosicaoValida(e, eTemp.getPosicao(), i)) {
					eTemp.voltaAUltimaPosicao();
					return false;
				} else return true;
			} else return false;
		}

        //Caso eTemp seja um robô:
		if (eTemp.getClass().getSimpleName().equals("Robo")) {
			eTemp.contactHero((Animado) e.get(0), e);
			return true;
		}
        
        return false;
    }

    //Função usada por ehPosicaoValida
	private boolean ehPosicaoValidaRobo(ArrayList<Elemento> e, Animado robo, int eTempIndex) {

        //Caso não seja o heroi, não faz nada
        if (eTempIndex != 0) return true;

		robo.contactHero((Animado) e.get(0), e);

        return true;
    }

    public boolean ehPosicaoValida(ArrayList<Elemento> e, Posicao p, int index) {
		Elemento eTemp;
		/* Validacao da posicao de todos os elementos com relacao a Posicao p */
		for (int i = 0; i < e.size(); i++) { // Olha todos os elementos
			if (index != i) {
				eTemp = e.get(i); // Pega o i-esimo elemento do jogo
                if(eTemp.getPosicao().estaNaMesmaPosicao(p)) {
				    if (!eTemp.isbTransponivel()){

                        //Caso quem tenha chamado a função seja o heroi:
    				    if (index == 0) return ehPosicaoValidaHeroi(e, eTemp, i);
                        else return false;

				    }
                    //Caso quem tenha chamado a função seja um robô:
			        else if (e.get(index).getClass().getSimpleName().equals("Robo")){
                        return ehPosicaoValidaRobo(e, (Animado) e.get(index), i);
                    }
                }
            }
		}
		return true;
	}

}