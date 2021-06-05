package dados_pessoais;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DadosPessoais implements Serializable{
    private String nome;
    private int idade;
    private Endereco endereco;
    
    public DadosPessoais() { }

    public DadosPessoais(Endereco endereco, String nome, int idade) {
        this.endereco = endereco;
        this.nome = nome;
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
