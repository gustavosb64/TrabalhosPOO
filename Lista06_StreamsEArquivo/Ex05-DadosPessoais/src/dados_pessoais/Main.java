package dados_pessoais;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        
        /*Geração de números aleatórios para o número da casa e para a idade*/
        Random randGen = new Random();
        int rNumCasa = randGen.nextInt(300);
        int rIdade = randGen.nextInt(80);

        Endereco endereco = new Endereco("Rua 1", "Botafogo", rNumCasa);
        DadosPessoais dados = new DadosPessoais(endereco, "Fulano", rIdade);

        FileClass wFile = new FileClass(); 

        wFile.EscreveDadosPessoais("dados_teste",dados);    

        FileClass rFile = new FileClass(); 

        DadosPessoais dadosLidos = rFile.LerDadosPessoais("dados_teste");

        System.out.println("Nome: " + dadosLidos.getNome());
        System.out.println("Idade: " + dadosLidos.getIdade());
        System.out.println("Endereco: ");
        System.out.println("\tRua: " + dadosLidos.getEndereco().getNomeRua());
        System.out.println("\tBairro: " + dadosLidos.getEndereco().getNomeBairro());
        System.out.println("\tNumero da casa: " + dadosLidos.getEndereco().getNumCasa());

    }
}
