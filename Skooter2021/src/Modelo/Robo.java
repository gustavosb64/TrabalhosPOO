package Modelo;

import java.util.ArrayList;

import Auxiliar.Consts;
import Controler.ControleDeJogo;

public class Robo extends Animado{

	private static final long serialVersionUID = 1L;
    private int direction; // 0 = cima; 1 = esquerda; 2 = baixo; 3 = direita
    private int iContaFrames; 
	
	public Robo(String sNomeImagePNG) {
		super(sNomeImagePNG);
        super.bTransponivel = false;
        this.iContaFrames = 0;
        this.direction = 0;
	}

	public void autoDesenho(ArrayList<Elemento> ListElem, int index) {
        ControleDeJogo cControle = new ControleDeJogo();

        this.iContaFrames++;
        if(this.iContaFrames == Consts.TIMER_ROBO){
            if (this.direction == 0){
                if (!this.moveUp() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)) {
                    this.voltaAUltimaPosicao();
                    this.direction = 2;
                }
            }
            if (this.direction == 2){
                if (!this.moveDown() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)) {
                    this.voltaAUltimaPosicao();
                    this.direction = 0;
                }
                System.out.println("io:" + this.direction);
            }

            this.iContaFrames = 0;
        }

        super.autoDesenho(ListElem, index);
    }


	public boolean move(){
        /*
        super.autoDesenho();
        if (direction == 0){
            this.moveUp();
            if (!
        } 
        if (direction == 1){
        } 
        if (direction == 2){
        } 
        if (direction == 3){
        } 
        */

        return false;
    }


    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }
	
	
}
