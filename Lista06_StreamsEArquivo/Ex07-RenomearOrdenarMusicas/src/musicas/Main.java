package musicas;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	private static final String DIRETORIO = "/home/mateus/Área de Trabalho/diretorio_musicas/";

	public static void main(String[] args) {
		File file = new File(DIRETORIO);
		ArrayList<File> arquivos = new ArrayList <File>(Arrays.asList(file.listFiles()));
		
		arquivos.removeIf(a -> !a.getName().contains(".mp3"));
		
		arquivos.forEach(a -> System.out.println(a.getName()));
		
		arquivos.sort((x, y) -> Double.compare(x.length(), y.length()));
		
		System.out.println();
		
		Contador contador = new Contador();
		int count = 1;
		for (File arquivo : arquivos) {
			arquivo.renameTo(new File(DIRETORIO+arquivo.getName().replaceAll("(?!mp3)&[0-9]+|-+", "")));
			arquivo.renameTo(new File(DIRETORIO+contador.countUp(count) + "." + arquivo.getName()));
			count++;
		}
		
	}
}
