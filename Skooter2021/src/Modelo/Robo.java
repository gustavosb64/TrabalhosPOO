package Modelo;

import java.util.ArrayList;
import java.util.Random;

import Auxiliar.Consts;
import Controler.ControleDeJogo;

public class Robo extends Animado{

	private static final long serialVersionUID = 1L;
    private int direction; // 0 = cima; 1 = esquerda; 2 = baixo; 3 = direita
    private int iContaFrames; 
    private ArrayList<Integer> ListDirections = new ArrayList<Integer>();
	
	public Robo(String sNomeImagePNG) {
		super(sNomeImagePNG);
        super.bTransponivel = false;
        this.iContaFrames = 0;
        for (int i=0; i<4; i++) ListDirections.add(i);
	}

	public void autoDesenho(ArrayList<Elemento> ListElem, int index) {
        ControleDeJogo cControle = new ControleDeJogo();

        Random randGen = new Random();
        
        this.direction = ListDirections.get(randGen.nextInt(4));
        this.iContaFrames++;

        if(this.iContaFrames == Consts.TIMER_ROBO){
            switch (this.direction){
                case 0:
                    if (!this.moveUp() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)){
                        this.voltaAUltimaPosicao();
                    }
                    break;

                case 1:
                    if (!this.moveRight() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)){
                        this.voltaAUltimaPosicao();
                    }
                    break;

                case 2:
                    if (!this.moveDown() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)){
                        this.voltaAUltimaPosicao();
                    }
                    break;
                    
                case 3:
                    if (!this.moveLeft() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)){
                        this.voltaAUltimaPosicao();
                    }
                    break;
            }

            this.iContaFrames = 0;
        }

        super.autoDesenho(ListElem, index);
    }

	public boolean move(){

        return false;
    }

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }
	
}
