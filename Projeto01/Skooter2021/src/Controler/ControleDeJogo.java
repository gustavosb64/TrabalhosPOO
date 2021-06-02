package Controler;

import Modelo.Elemento;
import Modelo.Hero;
import Auxiliar.Posicao;
import java.util.ArrayList;

/**
 *
 * @author junio
 */
public class ControleDeJogo {
    public void desenhaTudo(ArrayList<Elemento> e){
        for(int i = 0; i < e.size(); i++){
            e.get(i).autoDesenho();
        }
    }
    public void processaTudo(ArrayList<Elemento> e){
        Hero hHero = (Hero)e.get(0); /*O heroi (protagonista) eh sempre o primeiro do array*/
        Elemento eTemp;
        /*Processa todos os demais em relacao ao heroi*/
        for(int i = 1; i < e.size(); i++){
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/
            /*Verifica se o heroi se sobrepoe ao i-ésimo elemento*/
            if(hHero.getPosicao().estaNaMesmaPosicao(eTemp.getPosicao()))
                /*Nem todos os elementos podem ser transpostos pelo heroi*/
                if(eTemp.isbTransponivel())
                    e.remove(eTemp);
        }
    }
    public boolean ehPosicaoValida(ArrayList<Elemento> e, Posicao p){
        Elemento eTemp;
        /*Validacao da posicao de todos os elementos com relacao a Posicao p*/
        for(int i = 1; i < e.size(); i++){ /*Olha todos os elementos*/
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/
            if(!eTemp.isbTransponivel())
                if(eTemp.getPosicao().estaNaMesmaPosicao(p))
                    return false; /*A posicao p é invalida, pois ha um elemento (i-esimo eTemp) intransponivel lá*/
        }
        return true;
    }
}
