package Modelo;

import java.util.ArrayList;
import java.util.Random;

import Auxiliar.Consts;
import Auxiliar.Desenhador;

@SuppressWarnings("serial")
public class Coracao extends Animado{
    private int iContaFrames; 
    private int direction; // 0 = cima; 1 = esquerda; 2 = baixo; 3 = direita

	public Coracao(String sNomeImagePNG) {
		super(sNomeImagePNG);
        super.bTransponivel = true;
        this.direction = 0;
        this.iContaFrames = 0;
	}

	public void autoDesenho(ArrayList<Elemento> ListElem, int index) {

        //seleção aleatória para a direção do movimento
        Random randGen = new Random();
        this.direction = randGen.nextInt(4);

        this.iContaFrames++;
        if(this.iContaFrames == Consts.TIMER_CORACAO){
            switch (this.direction){
                case 0:
                    if (!this.moveUp()){
                        this.voltaAUltimaPosicao();
                    }
                    break;

                case 1:
                    if (!this.moveRight()){
                        this.voltaAUltimaPosicao();
                    }
                    break;

                case 2:
                    if (!this.moveDown()){
                        this.voltaAUltimaPosicao();
                    }
                    break;
                    
                case 3:
                    if (!this.moveLeft()){
                        this.voltaAUltimaPosicao();
                    }
                    break;
            }

            this.iContaFrames = 0;
        }

        super.autoDesenho(ListElem, index);
    }

	//Esse método é chamado quando o heroi pega o coração. Incrementa o número de vidas do heroi e remove
	//O coração da tela.
    @Override
	public void contatoTransponivel(ArrayList<Elemento> listaElementos) { 
        int vidasHeroi =  Desenhador.getTelaDoJogo().getVidasHeroi();
        Desenhador.getTelaDoJogo().setVidasHeroi(vidasHeroi + 1);
       
	    listaElementos.remove(this);	    
        return;
    }


}
