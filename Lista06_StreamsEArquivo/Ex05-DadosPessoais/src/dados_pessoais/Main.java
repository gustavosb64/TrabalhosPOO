package dados_pessoais;

public class Main {

    public static void main(String[] args){
        
        Endereco endereco = new Endereco("Rua 1", "Botafogo", 414);
        DadosPessoais dados = new DadosPessoais(endereco, "Fulano", 28);

        WriteFileClass wFile = new WriteFileClass(); 

        wFile.EscreveDadosPessoais("dados_teste",dados);    

    }
}
