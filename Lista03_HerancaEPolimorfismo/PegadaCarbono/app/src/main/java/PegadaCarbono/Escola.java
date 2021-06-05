package PegadaCarbono;

public class Escola extends Predio{
    public int nFuncionarios;
    public int nEstudantes;
    
    public Escola(int nFrequentadores, double mediaLixoPorFrequentador, double consumoGasPorDia, int nFuncionarios, int nEstudantes) {
        super(nFrequentadores, mediaLixoPorFrequentador, consumoGasPorDia);
        this.nFuncionarios = nFuncionarios;
        this.nEstudantes = nEstudantes;
    }

    public int getNFuncionarios() {
        return nFuncionarios;
    }

    public void setNFuncionarios(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }

    public int getNEstudantes() {
        return nEstudantes;
    }

    public void setNEstudantes(int nEstudantes) {
        this.nEstudantes = nEstudantes;
    }
}
