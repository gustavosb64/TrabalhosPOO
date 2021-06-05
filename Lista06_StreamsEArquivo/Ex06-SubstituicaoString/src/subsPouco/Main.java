package subsPouco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main{

    public static void main(String[] args){
        String fileName = "textFile1.txt";
        File fString = new File(fileName);

        BufferedReader bReader;
        /*TODO:
         * Implementar escrita de nova string no arquivo de texto
        */
        try {
            FileReader fReader = new FileReader(fString);
            RandomAccessFile raf = new RandomAccessFile(fString, "rw");
            raf.seek(0);

            bReader = new BufferedReader(fReader);
            String newTxtLine;
            String origTxtLine = bReader.readLine();
            int rafLength = 0;
            do{
                System.out.println(origTxtLine);
                if (origTxtLine.indexOf("muito") != -1){
                    newTxtLine = origTxtLine.replaceAll("muito","pouco"); 
                    //raf.seek(rafLength);
                    //raf.writeUTF(newTxtLine);
                    //rafLength += newTxtLine.length();
                    System.out.println(newTxtLine);
                }
                else rafLength += origTxtLine.length();
                origTxtLine = bReader.readLine();
            }while(origTxtLine != null);

            raf.close();

        } catch (IOException e){
            e.printStackTrace(); 
        } 

    }
}
