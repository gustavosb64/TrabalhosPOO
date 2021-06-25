import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String args[]) {

        try {
            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            while (true) {
                userInput = LEITOR_ENTRADA_PADRAO.readLine();
                if (userInput.compareTo("exit") == 0) {
                    System.exit(0);
                }
                if (userInput.compareTo("new") == 0) {
                    ThreadJFrame tJF = new ThreadJFrame();
                    tJF.start();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
