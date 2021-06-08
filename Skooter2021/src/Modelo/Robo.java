package Modelo;

import java.util.ArrayList;
import java.util.Random;

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

        ArrayList<Integer> Lista = new ArrayList<Integer>();
        Random randGen = new Random();
        this.iContaFrames++;
        if(this.iContaFrames == Consts.TIMER_ROBO){
            if (this.direction == 0){
                System.out.println("0");
                if (!this.moveUp() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)) {
                    this.voltaAUltimaPosicao();

                    Lista.add(1);
                    Lista.add(2);
                    Lista.add(3);

                    this.direction = Lista.get(randGen.nextInt(3));
                }
            }
            if (this.direction == 1){
                System.out.println("1");
                if (!this.moveRight() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)) {
                    this.voltaAUltimaPosicao();

                    Lista.add(0);
                    Lista.add(2);
                    Lista.add(3);

                    this.direction = Lista.get(randGen.nextInt(3));
                }
            }
            if (this.direction == 2){
                System.out.println("2");
                if (!this.moveDown() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)) {
                    this.voltaAUltimaPosicao();

                    Lista.add(0);
                    Lista.add(1);
                    Lista.add(3);

                    this.direction = Lista.get(randGen.nextInt(3));
                }
            }
            if (this.direction == 3){
                System.out.println("3");
                if (!this.moveLeft() || !cControle.ehPosicaoValida(ListElem,this.getPosicao(),index)) {
                    this.voltaAUltimaPosicao();

                    Lista.add(0);
                    Lista.add(1);
                    Lista.add(2);

                    this.direction = Lista.get(randGen.nextInt(3));
                }
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
