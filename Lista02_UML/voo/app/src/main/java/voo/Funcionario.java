package voo;

public class Funcionario{
    private String nome;
    private int codigoFuncionario;

    public Funcionario(String nome, int codigoFuncionario) {
        this.nome = nome;
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
}
