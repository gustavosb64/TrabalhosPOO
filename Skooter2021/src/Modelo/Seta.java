package Modelo;

import java.util.ArrayList;

import Controler.ControleDeJogo;

@SuppressWarnings("serial")
public class Seta extends Elemento{

    public Seta(String sNomeImagemString, Orientacao orientacao){
        super(sNomeImagemString);
        super.bTransponivel = true;    
        super.orientacao = orientacao;
    }

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }

    @Override
    public void contatoTransponivel(ArrayList<Elemento> ListElem){
        ControleDeJogo cControle = new ControleDeJogo();
        Hero hHeroi = (Hero) ListElem.get(0);

		switch (super.orientacao) {
		    case CIMA:
                hHeroi.moveUp();
                if (!cControle.ehPosicaoValida(ListElem,hHeroi.getPosicao(),0)) 
                    hHeroi.voltaAUltimaPosicao();

			    break;

		    case BAIXO:
                hHeroi.moveDown();
                if (!cControle.ehPosicaoValida(ListElem,hHeroi.getPosicao(),0)) 
                    hHeroi.voltaAUltimaPosicao();

			    break;

		    case ESQUERDA:
                hHeroi.moveLeft();
                if (!cControle.ehPosicaoValida(ListElem,hHeroi.getPosicao(),0)) 
                    hHeroi.voltaAUltimaPosicao();

			    break;

		    case DIREITA:
                hHeroi.moveRight();
                if (!cControle.ehPosicaoValida(ListElem,hHeroi.getPosicao(),0)) 
                    hHeroi.voltaAUltimaPosicao();

			    break;
		}

        return;
    }

}
