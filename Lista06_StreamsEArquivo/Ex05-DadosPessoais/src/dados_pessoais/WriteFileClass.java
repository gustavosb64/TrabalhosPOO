package dados_pessoais;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

public class WriteFileClass {

    public WriteFileClass() { }  

    public void EscreveDadosPessoais(String FileName, DadosPessoais dados){

        try{

            File wDadosPessoais = new File(FileName);
            wDadosPessoais.createNewFile();

            FileOutputStream fOutputStream = new FileOutputStream(wDadosPessoais);
            GZIPOutputStream compactador = new GZIPOutputStream(fOutputStream);
            ObjectOutputStream serializador = new ObjectOutputStream(compactador);

            serializador.writeObject(dados);

            serializador.flush();
            serializador.close();

        } catch (IOException e){
            e.printStackTrace();
        }

    }
        /*
        try{
            byte[] byteBuffer = new byte[4096];

            File rDadosPessoais = new File(FileName);
            File wDadosPessoais = new File(FileName2);

            FileInputStream fInputStream = new FileInputStream(rDadosPessoais);
            GZIPInputStream compactador = new GZIPOutputStream(fInputStream);
            FileOutputStream fOutputStream = new FileOutputStream(wDadosPessoais);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        */
}

