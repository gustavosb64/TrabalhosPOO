package PegadaCarbono;

public class Casa extends Predio{
    public int nComodos; 
    public int nChuveiros; 

    public Casa(int nFrequentadores, double mediaLixoPorFrequentador, double consumoGasPorDia, int nComodos, int nChuveiros) {
        super(nFrequentadores, mediaLixoPorFrequentador, consumoGasPorDia);
        this.nComodos = nComodos;
        this.nChuveiros = nChuveiros;
    }

    public int getNComodos() {
        return nComodos;
    }

    public void setNComodos(int nComodos) {
        this.nComodos = nComodos;
    }

    public int getNChuveiros() {
        return nChuveiros;
    }

    public void setNChuveiros(int nChuveiros) {
        this.nChuveiros = nChuveiros;
    }
}

