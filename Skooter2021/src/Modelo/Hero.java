package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Auxiliar.Consts;
import Auxiliar.Posicao;

@SuppressWarnings("serial")
public class Hero extends Animado implements Serializable {
    private int iVidas;
    private static Hero heroi;

	private Hero(String sNomeImagePNG) {
		super(sNomeImagePNG);
        this.iVidas = 2;
	}
	
	public static synchronized Hero getHero() {
		if(heroi == null)
			heroi = new Hero("skooter_hero_down.png");
		return heroi;
	}

	//Esse método é chamado quando a tecla "espaço" é pressionada.
	public boolean ataque(ArrayList<Elemento> listaElementos) {
		Posicao posicao = new Posicao(0, 0);
		Elemento elementoTemp;
		switch (super.orientacao) {
		    case CIMA:
			    posicao.setPosicao(this.getPosicao().getLinha() - 1, this.getPosicao().getColuna());
			    break;

		    case BAIXO:
			    posicao.setPosicao(this.getPosicao().getLinha() + 1, this.getPosicao().getColuna());
			    break;

		    case ESQUERDA:
			    posicao.setPosicao(this.getPosicao().getLinha(), this.getPosicao().getColuna() - 1);
			    break;

		    case DIREITA:
			    posicao.setPosicao(this.getPosicao().getLinha(), this.getPosicao().getColuna() + 1);
			    break;
		}
		
		//Verifica se existe algum elemento no alcance do ataque do heroi.
		for(int i = 1; i < listaElementos.size(); i++) {
			elementoTemp = listaElementos.get(i);           
			if(elementoTemp.getPosicao().estaNaMesmaPosicao(posicao)) {
				elementoTemp.contatoComAtaque(listaElementos, this.orientacao, i);
			}
		}
		
		return true;
	}

    public int getIVidas(){
        return this.iVidas;
    }

    public void setIVidas(int vida){
        this.iVidas = vida;
    }

    public void setImage(String sNomeImagePNG){
        
        try {
            iImage = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            Image img = iImage.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImage = new ImageIcon(bi);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
   
}
