package pack;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		GeradorDeEmails geradorDeEmails = new GeradorDeEmails();
		Email[] listaDeEmails = new Email[10];
		
		
		//Emails são gerados aleatóriamente e inseridos no array
		for(int i = 0; i < 10; i++)
			listaDeEmails[i] = geradorDeEmails.gerarEmail();
		
		Generica<Email> genericaEmails = new Generica<Email>(listaDeEmails);
		
		//O critério de comparação é o status do email. Os emails de maior urgência vêem antes 
		//dos de menor urgência. Se comentar a linha abaixo pode ver a diferença
		genericaEmails.sort();
		
		for (Email email : genericaEmails.getListaElementos()) {
			System.out.println(email);
		}	
	}

}
