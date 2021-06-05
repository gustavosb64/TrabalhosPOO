package voo;

public class Aeroporto{
    private String nome;
    private String cidade;
    private int capacidadeDecolagemHora;

    public Aeroporto(String nome, String cidade, int capacidadeDecolagemHora) {
        this.nome = nome;
        this.cidade = cidade;
        this.capacidadeDecolagemHora = capacidadeDecolagemHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCapacidadeDecolagemHora() {
        return capacidadeDecolagemHora;
    }

    public void setCapacidadeDecolagemHora(int capacidadeDecolagemHora) {
        this.capacidadeDecolagemHora = capacidadeDecolagemHora;
    }
}
