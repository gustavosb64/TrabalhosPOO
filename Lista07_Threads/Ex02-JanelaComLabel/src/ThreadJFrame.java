import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ThreadJFrame extends Thread{

    public void run(){
        //Definindo estado inicial como 0
        int rand = 0; 

        try{

            JFrame jfTela = new JFrame();
            jfTela.setSize(new Dimension(200, 200));
            jfTela.setLayout(new BorderLayout());
            jfTela.setVisible(true);

            JLabel jlTexto = new JLabel();
            while(true){

                jlTexto.setText(""+rand);
                jfTela.add(jlTexto);

                Thread.sleep(1000);

                jlTexto.setText("");
                jfTela.add(jlTexto);

                rand = new Random().nextInt(100000);
            }

        }catch(InterruptedException e){
            
        }

    }

}
