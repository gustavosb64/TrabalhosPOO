package dados_pessoais;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Endereco implements Serializable{
    private String nomeRua;
    private String nomeBairro;
    private int numCasa;

    public Endereco(String nomeRua, String nomeBairro, int numCasa) {
        this.nomeRua = nomeRua;
        this.nomeBairro = nomeBairro;
        this.numCasa = numCasa;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

}
