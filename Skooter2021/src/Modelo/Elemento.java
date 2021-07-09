package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Auxiliar.Posicao;

@SuppressWarnings("serial")
public abstract class Elemento implements Serializable {

    protected ImageIcon iImage;
    protected Posicao pPosicao;
    protected boolean bTransponivel; /*Pode passar por cima?*/
    protected boolean bMortal;       /*Se encostar, morre?*/
    protected boolean bMovel;       
	protected Orientacao orientacao;
       
    protected Elemento(String sNomeImagePNG) {
        this.pPosicao = new Posicao(1, 1);
        this.bTransponivel = true;
        this.bMortal = false;
        this.bMovel = false;
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

    public boolean isMovel() {
        return bMovel;
    }

    public Posicao getPosicao() {
        return pPosicao;
    }

    public boolean isbTransponivel() {
        return bTransponivel;
    }

    public boolean setPosicao(int linha, int coluna) {
        return pPosicao.setPosicao(linha, coluna);
    }
    
	public void autoDesenho(ArrayList<Elemento> ListElem, int index) {
        Desenhador.desenhar(this.iImage, pPosicao.getColuna(), pPosicao.getLinha());        
    }   

    public boolean contactHero(Animado hHeroi, ArrayList<Elemento> e) {
    	return false;
    }
 
    public void voltaAUltimaPosicao(){
        this.pPosicao.volta();
    }
    
    public void contatoComAtaque(ArrayList<Elemento> listaElementos, Orientacao orientacao, int index) {
    	return;
    }

    //Remove elementos transponíveis da tela 
	public void contatoTransponivel(ArrayList<Elemento> listaElementos) { 
	    listaElementos.remove(this);
        return;
	}

}
