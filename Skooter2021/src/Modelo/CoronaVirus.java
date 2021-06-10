package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class CoronaVirus extends Elemento implements Serializable{
    private boolean bRight;

    public CoronaVirus(String sNomeImagePNG) {
        super(sNomeImagePNG);
        bRight = true;
        this.bTransponivel = false;
    }
    
	public void autoDesenho(ArrayList<Elemento> ListElem, int index) {
        if(bRight)
            this.setPosicao(pPosicao.getLinha(), pPosicao.getColuna()+1);
        else
            this.setPosicao(pPosicao.getLinha(), pPosicao.getColuna()-1);           

        super.autoDesenho(ListElem, index);
        bRight = !bRight;
    }

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e){
        return true;
    }
}
