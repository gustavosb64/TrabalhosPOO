package Controler;

import java.util.ArrayList;

import Auxiliar.Posicao;
import Modelo.Animado;
import Modelo.Elemento;
import Modelo.Hero;

public class ControleDeJogo {
    public void desenhaTudo(ArrayList<Elemento> ListElem){
        for(int i = 0; i < ListElem.size(); i++){
            ListElem.get(i).autoDesenho(ListElem, i);
        }
    }
    public void processaTudo(ArrayList<Elemento> e){
        Hero hHero = (Hero)e.get(0); /*O heroi (protagonista) eh sempre o primeiro do array*/
        Elemento eTemp;
        /*Processa todos os demais em relacao ao heroi*/
        for(int i = 1; i < e.size(); i++){
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/
            /*Verifica se o heroi se sobrepoe ao i-ésimo elemento*/
            if(hHero.getPosicao().estaNaMesmaPosicao(eTemp.getPosicao())){
                if (eTemp.isbTransponivel() == true) {
                    e.remove(eTemp);
                }
            }
        }
    }

    public boolean ehPosicaoValida(ArrayList<Elemento> e, Posicao p, int index) {
        Elemento eTemp;
        /* Validacao da posicao de todos os elementos com relacao a Posicao p*/
        for (int i = 1; i < e.size(); i++) { // Olha todos os elementos 
            if (index != i) {
                eTemp = e.get(i); // Pega o i-esimo elemento do jogo 
                if (!eTemp.isbTransponivel()) {
                    if (eTemp.getPosicao().estaNaMesmaPosicao(p)) {
                        if (index == 0 && eTemp.isMovel() == true) {
                            eTemp.contactHero((Animado) e.get(0), e);
                            if (!ehPosicaoValida(e, eTemp.getPosicao(), i)) {
                                eTemp.voltaAUltimaPosicao();
                                return false;
                            }
                            else return true;
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
