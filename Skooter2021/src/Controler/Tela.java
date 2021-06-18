package Controler;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Modelo.Elemento;
import Modelo.Hero;

@SuppressWarnings("serial")
public class Tela extends javax.swing.JFrame implements MouseListener, KeyListener {

    private Hero hHero;
//    private ArrayList<Fase> fases = new ArrayList<Fase>();
    private ArrayList<Elemento> eElementos;
    private ControleDeJogo cControle = new ControleDeJogo();
    private Graphics g2;
    private int faseAtual;
    private int vidasHeroi;
    /**
     * Creates new form
     */
    public Tela() {
        Desenhador.setCenario(this); /*Desenhador funciona no modo estatico*/
        initComponents();
 
        this.addMouseListener(this); /*mouse*/
        this.addKeyListener(this);   /*teclado*/
        
        /*Cria a janela do tamanho do cenario + insets (bordas) da janela*/
        this.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);

        
        this.faseAtual = 0;
        this.vidasHeroi = 2;


        this.setFase();
    }

    public int getVidasHeroi() {
		return vidasHeroi;
	}

	public void setVidasHeroi(int vidasHeroi) {
		this.vidasHeroi = vidasHeroi;
	}

	public ArrayList<Elemento> getListaElementos(){
        return this.eElementos;
    }

/*--------------------------------------------------*/
    public void addElemento(Elemento umElemento) {
        eElementos.add(umElemento);
    }

    public Hero gethHero() {
		return hHero;
	}

	public ArrayList<Elemento> geteElementos() {
		return eElementos;
	}

	public ControleDeJogo getcControle() {
		return cControle;
	}

	public Graphics getG2() {
		return g2;
	}

	public void removeElemento(Elemento umElemento) {
        eElementos.remove(umElemento);
    }

    public Graphics getGraphicsBuffer(){
        return g2;
    }
    
    /*Este metodo eh executado a cada Consts.FRAME_INTERVAL milissegundos*/    
    public void paint(Graphics gOld) {
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        g2 = g.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);

        /*Desenha cenário*/
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                try {
                    /*Linha para alterar o background*/
                    Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "background.png");
                    g2.drawImage(newImage,j*Consts.CELL_SIDE, i*Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);

                } catch (IOException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        /*Aqui podem ser inseridos novos processamentos de controle*/
        if (!this.eElementos.isEmpty()) {
            this.cControle.desenhaTudo(eElementos);
            this.cControle.processaTudo(eElementos);
        }

        g.dispose();
        g2.dispose();
        if (!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        }
    }

    public void go() {
        TimerTask redesenhar = new TimerTask() {
            public void run() {
                repaint(); /*(executa o metodo paint)*/
            }
        };        
        
        /*Redesenha (executa o metodo paint) tudo a cada Consts.FRAME_INTERVAL milissegundos*/
        Timer timer = new Timer();
        timer.schedule(redesenhar, 0, Consts.FRAME_INTERVAL);
    }

    public void keyPressed(KeyEvent e) {
        /*Movimento do heroi via teclado*/
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hHero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hHero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hHero.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            hHero.moveRight();
        } else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
        	hHero.ataque(eElementos); 
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        } else if (e.getKeyCode() == KeyEvent.VK_R) {

            this.setFase();
            /*
            this.eElementos.clear();
            eElementos = fase.CriaFase2();
            */
        
            /*
            this.eElementos.clear();
            hHero = new Hero("vacina.png");
            hHero.setPosicao(0, 7);
            this.addElemento(hHero);

            CoronaVirus cTeste = new CoronaVirus("carro_azul.png");
            cTeste.setPosicao(5, 5);
            this.addElemento(cTeste);
            */
        }
        
        /*Se o heroi for para uma posicao invalida, sobre um elemento intransponivel, volta para onde estava*/
        if (!cControle.ehPosicaoValida(this.eElementos,hHero.getPosicao(),0)) {
            hHero.voltaAUltimaPosicao();
        }

        this.setTitle("-> Cell: " + (hHero.getPosicao().getColuna()) + ", " + (hHero.getPosicao().getLinha()));
    }

    public void mousePressed(MouseEvent e) {
         //Movimento via mouse
         int x = e.getX();
         int y = e.getY();
     
         this.setTitle("X: "+ x + ", Y: " + y +
         " -> Cell: " + (y/Consts.CELL_SIDE) + ", " + (x/Consts.CELL_SIDE));
        
         this.hHero.getPosicao().setPosicao(y/Consts.CELL_SIDE, x/Consts.CELL_SIDE);

        /*Se o heroi for para uma posicao invalida, sobre um elemento intransponivel, volta para onde estava*/
        if (!cControle.ehPosicaoValida(this.eElementos,hHero.getPosicao(),0)) {
            hHero.voltaAUltimaPosicao();
        }         
         
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POO2021");
        setAutoRequestFocus(false);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public ArrayList<Elemento> getArrayElemento(){
       return this.eElementos; 
    }
    
    public int getFaseAtual() {
		return faseAtual;
	}
    
    public ArrayList<Elemento> setFase() {

        /*
         * Não funciona
        this.eElementos = this.fases.get(this.faseAtual);
        this.eElementos = new Fase().CriaFase1();
        */
        switch(this.faseAtual){
            case 0:
                this.eElementos = new Fase().CriaFase1();
                break;
            case 1:
                this.eElementos = new Fase().CriaFase2();
                break;
        } 

        hHero = (Hero) eElementos.get(0);

        return this.eElementos;
    }
    
    public void setProximaFase() {
        this.faseAtual++;	
        return;
    }

}
