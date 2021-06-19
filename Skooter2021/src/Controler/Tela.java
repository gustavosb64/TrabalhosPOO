package Controler;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Modelo.Elemento;
import Modelo.Hero;

@SuppressWarnings("serial")
public class Tela extends javax.swing.JFrame implements KeyListener {

    private Hero hHero;
    private ArrayList<Elemento> eElementos;
    private ControleDeJogo cControle = new ControleDeJogo();
    private Graphics g2;
    private int faseAtual;
    private int vidasHeroi;
    
   
    public Tela() throws Exception {
    	this.faseAtual = 0;
        this.vidasHeroi = 2;
        
        File caminhoMusica  = new File("."+File.separator+"music"+File.separator+"ost.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(caminhoMusica);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        
        Desenhador.setCenario(this); /*Desenhador funciona no modo estatico*/
        initComponents();
        this.addKeyListener(this);   /*teclado*/
        
        /*Cria a janela do tamanho do cenario + insets (bordas) da janela*/
        this.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);

        this.setFase();
    }

    public int getVidasHeroi() {
		return vidasHeroi;
	}

	public void setVidasHeroi(int vidasHeroi) {
		this.vidasHeroi = vidasHeroi;
	}

/*--------------------------------------------------*/
	public ControleDeJogo getcControle() {
		return cControle;
	}

	public Graphics getG2() {
		return g2;
	}

    public Graphics getGraphicsBuffer(){
        return g2;
    }
    
    //Este metodo eh executado a cada Consts.FRAME_INTERVAL milissegundos
    public void paint(Graphics gOld) {
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        g2 = g.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);

        //Desenha cenário
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                try {
                    //Linha para alterar o background
                    Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "background.png");
                    g2.drawImage(newImage,j*Consts.CELL_SIDE, i*Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);

                } catch (IOException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        //Aqui podem ser inseridos novos processamentos de controle
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
        
        //Redesenha (executa o metodo paint) tudo a cada Consts.FRAME_INTERVAL milissegundos
        Timer timer = new Timer();
        timer.schedule(redesenhar, 0, Consts.FRAME_INTERVAL);
    }

    public void keyPressed(KeyEvent e) {
        //Movimento do heroi via teclado
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hHero.moveUp();
            hHero.setImage("skooter_hero_up.png");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hHero.moveDown();
            hHero.setImage("skooter_hero_down.png");
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hHero.moveLeft();
            hHero.setImage("skooter_hero.png");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            hHero.moveRight();
            hHero.setImage("skooter_hero_right.png");
        } else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
        	hHero.ataque(eElementos); 
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        } else if (e.getKeyCode() == KeyEvent.VK_R) { //Reseta fase atual
            this.setFase();
        }
        
        //Se o heroi for para uma posicao invalida, sobre um elemento intransponivel, volta para onde estava
        if (!cControle.ehPosicaoValida(this.eElementos,hHero.getPosicao(),0)) {
            hHero.voltaAUltimaPosicao();
        }

        this.setTitle("-> Cell: " + (hHero.getPosicao().getColuna()) + ", " + (hHero.getPosicao().getLinha()));
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

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
    
    public int getFaseAtual() {
		return faseAtual;
	}
    
    public ArrayList<Elemento> setFase() {

        switch(this.faseAtual){
            case 0:
                this.eElementos = new Fase().CriaFase1();
                break;
            case 1:
                this.eElementos = new Fase().CriaFase2();
                break;
            case 2:
                this.eElementos = new Fase().CriaFase3();
                break;
            case 3:
                this.eElementos = new Fase().CriaFase4();
                break;
            case 4:
                System.out.println("FIM DE JOGO!");
                System.exit(0);
        } 

        hHero = (Hero) eElementos.get(0);

        return this.eElementos;
    }
    
    public void setProximaFase() {
        this.faseAtual++;	
        this.setFase();
        return;
    }
}
