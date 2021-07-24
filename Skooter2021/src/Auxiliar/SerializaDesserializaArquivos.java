package Auxiliar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Modelo.BlocoBase;
import Modelo.BlocoDestrutivelDecoration;
import Modelo.BlocoMovelDecoration;
import Modelo.Coracao;
import Modelo.Elemento;
import Modelo.Robo;

public class SerializaDesserializaArquivos implements Serializable{

	private static final long serialVersionUID = 1364140947266026247L;
	
	private static void serializarObjeto(Elemento elemento, String nome) throws Exception, IOException {
		ObjectOutputStream objectOutput = new ObjectOutputStream(
				new FileOutputStream("." + File.separator + "elementos" + File.separator + nome + ".zip"));
		objectOutput.writeObject(elemento);
		objectOutput.close();
	}
	
	public static void serializarElementosJogo() throws IOException, Exception {
		serializarObjeto(new BlocoBase("bloco_vermelho_liso.png"), "bloco_vermelho_liso");
		serializarObjeto(new BlocoMovelDecoration("bloco_vermelho_prisma.png", new BlocoBase("bloco_vermelho_prisma.png")), "bloco_vermelho_prisma");
		serializarObjeto(new BlocoDestrutivelDecoration("bloco_verde_liso.png", new BlocoBase("bloco_verde_liso.png")), "bloco_verde_liso");
		serializarObjeto(new BlocoDestrutivelDecoration(null, new BlocoMovelDecoration("bloco_verde_prisma.png", new BlocoBase("bloco_verde_prisma.png"))), "bloco_verde_prisma");
		
		serializarObjeto(new Robo("robo_amarelo.png"), "robo_amarelo");
		serializarObjeto(new Robo("robo_azul.png"), "robo_azul");
		
		serializarObjeto(new Coracao("heart.png"), "coracao");
		
	}
	
	public static Object desserializarObjeto(String nome) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objectInput = new ObjectInputStream(
				new FileInputStream("." + File.separator + "elementos" + File.separator + nome));
		Object elemento = objectInput.readObject();
		return elemento;
	}
	
	public static Object desserializarObjeto(String nomeArquivo, String nomeDiretorio) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objectInput = new ObjectInputStream(
				new FileInputStream("." + File.separator + nomeDiretorio + File.separator + nomeArquivo));
		Object elemento = objectInput.readObject();
		return elemento;
	}
	

}
