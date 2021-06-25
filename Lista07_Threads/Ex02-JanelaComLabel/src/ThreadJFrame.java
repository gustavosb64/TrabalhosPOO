import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ThreadJFrame extends Thread{
    private int rand;
    private JFrame jfTela;
    private JLabel jlTexto;

    public void run(){
        //Definindo estado inicial como 0
        rand = 0; 

        try{

            jfTela = new JFrame();

            jfTela.setSize(new Dimension(200, 200));
            jfTela.setLayout(new BorderLayout());
            jfTela.setVisible(true);

            jlTexto = new JLabel();
            while(true){

                jlTexto.setText(""+rand);
                jfTela.add(jlTexto);

                Thread.sleep(1000);

                jlTexto.setText("");
                jfTela.add(jlTexto);

                rand = new Random().nextInt(100000);
            }

        }catch(InterruptedException e){ }

    }

    public void reset(){
        this.jlTexto.setText("0");
        this.jfTela.add(jlTexto);
    }

    public void bold(){
        this.jlTexto.setFont(jlTexto.getFont().deriveFont(jlTexto.getFont().getStyle() ^ Font.BOLD));
        this.jfTela.add(jlTexto);
    }

}
