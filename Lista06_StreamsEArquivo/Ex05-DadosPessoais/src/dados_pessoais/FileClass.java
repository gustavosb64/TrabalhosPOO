package dados_pessoais;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class FileClass {

    public FileClass() { }  

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

    public DadosPessoais LerDadosPessoais(String FileName){

        DadosPessoais dadosLidos = new DadosPessoais();

        try{
            File rDadosPessoais = new File(FileName);
            rDadosPessoais.createNewFile();

            FileInputStream fInputStream = new FileInputStream(rDadosPessoais);
            GZIPInputStream descompactador = new GZIPInputStream(fInputStream);
            ObjectInputStream desserializador = new ObjectInputStream(descompactador);

            try{
                dadosLidos = (DadosPessoais) desserializador.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            descompactador.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
 

        return dadosLidos;
        
    }
}

