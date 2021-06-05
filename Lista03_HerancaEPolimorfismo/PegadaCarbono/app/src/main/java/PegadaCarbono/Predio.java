package PegadaCarbono;

public abstract class Predio implements PegadaDeCarbono{
    private int nFrequentadores;
    private double mediaLixoPorFrequentador;
    private double consumoGasPorDia;

    public Predio(int nFrequentadores, double mediaLixoPorFrequentador, double consumoGasPorDia) {
        this.nFrequentadores = nFrequentadores;
        this.mediaLixoPorFrequentador = mediaLixoPorFrequentador;
        this.consumoGasPorDia = consumoGasPorDia;
    }

    public int getNFrequentadores() {
        return nFrequentadores;
    }

    public void setNFrequentadores(int nFrequentadores) {
        this.nFrequentadores = nFrequentadores;
    }

    public double getMediaLixoPorFrequentador() {
        return mediaLixoPorFrequentador;
    }

    public void setMediaLixoPorFrequentador(double mediaLixoPorFrequentador) {
        this.mediaLixoPorFrequentador = mediaLixoPorFrequentador;
    }

    public double getConsumoGasPorDia() {
        return consumoGasPorDia;
    }

    public void setConsumoGasPorDia(double consumoGasPorDia) {
        this.consumoGasPorDia = consumoGasPorDia;
    }

    public double getPegadaCarbono(){
        double pCarbono = (mediaLixoPorFrequentador * nFrequentadores * 0.2) + (consumoGasPorDia * 0.1);
        return pCarbono;
    }
}

