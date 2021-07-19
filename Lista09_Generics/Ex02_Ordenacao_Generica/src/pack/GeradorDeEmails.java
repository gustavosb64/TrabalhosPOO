package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeradorDeEmails {
	
	private List<String> titulos = new ArrayList<String>();
	private List<String> mensagens = new ArrayList<String>();
	private List<Status> listaStatus = new ArrayList<Status>();
	
	public Email gerarEmail() throws FileNotFoundException {
		Email email = new Email();
		String fileName = System.getProperty("user.dir") + "/src/pack/TitulosEmails.txt";
        Scanner scan1 = new Scanner(new File(fileName));
        while(scan1.hasNextLine()){
            titulos.add(scan1.nextLine());
        }
        
        fileName = System.getProperty("user.dir") + "/src/pack/ConteudoEmails.txt";
        Scanner scan2 = new Scanner(new File(fileName));
        while(scan2.hasNextLine()){
            mensagens.add(scan2.nextLine());
        }
        
        Random random = new Random();
        email.setTitulo(titulos.get(random.nextInt(titulos.size())));
        email.setCorpo(mensagens.get(random.nextInt(titulos.size())));
        email.setStatus(Status.randomStatus());
		return email;
	}
	
	
}
