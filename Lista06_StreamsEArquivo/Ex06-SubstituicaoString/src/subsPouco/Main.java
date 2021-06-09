package subsPouco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main{

    /*texto com substituição de substring armazenado em output.txt*/
    public static void main(String[] args){
        String inputFileName = "casosTeste"+File.separator+"textFile1.txt";

        try {
            PrintWriter pWriter = new PrintWriter("casosTeste"+File.separator+"output.txt");

            File fInput = new File(inputFileName);
            FileReader fReader = new FileReader(fInput);
            BufferedReader bReader = new BufferedReader(fReader);

            String origTxtLine = bReader.readLine();
            do{
                pWriter.println(origTxtLine.replaceAll("muito","pouco"));
                origTxtLine = bReader.readLine();
            }while(origTxtLine != null);

            bReader.close();
            pWriter.close();

        } catch (IOException e){
            e.printStackTrace(); 
        } 

    }
}
