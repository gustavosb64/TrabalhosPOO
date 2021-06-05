package InterfaceFutebol;

import java.util.Random;

public class TimeFutebol implements Comparable<TimeFutebol>{
    private String nomeTime;
    private int numVitorias;
    private int numDerrotas;
    private int numEmpates;
    private int numGolsMarcados;
    private int numGolsSofridos;
    private int numCartoesAmarelos;
    private int numCartoesVermelhos;

    public TimeFutebol(String nomeTime, int numVitorias, int numDerrotas, int numEmpates, int numGolsMarcados, int numGolsSofridos, int numCartoesAmarelos, int numCartoesVermelhos) {
        this.nomeTime = nomeTime;
        this.numVitorias = numVitorias;
        this.numDerrotas = numDerrotas;
        this.numEmpates = numEmpates;
        this.numGolsMarcados = numGolsMarcados;
        this.numGolsSofridos = numGolsSofridos;
        this.numCartoesAmarelos = numCartoesAmarelos;
        this.numCartoesVermelhos = numCartoesVermelhos;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public int getNumVitorias() {
        return numVitorias;
    }

    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }

    public int getNumDerrotas() {
        return numDerrotas;
    }

    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    }

    public int getNumEmpates() {
        return numEmpates;
    }

    public void setNumEmpates(int numEmpates) {
        this.numEmpates = numEmpates;
    }

    public int getNumGolsMarcados() {
        return numGolsMarcados;
    }

    public void setNumGolsMarcados(int numGolsMarcados) {
        this.numGolsMarcados = numGolsMarcados;
    }

    public int getNumGolsSofridos() {
        return numGolsSofridos;
    }

    public void setNumGolsSofridos(int numGolsSofridos) {
        this.numGolsSofridos = numGolsSofridos;
    }

    public int getNumCartoesAmarelos() {
        return numCartoesAmarelos;
    }

    public void setNumCartoesAmarelos(int numCartoesAmarelos) {
        this.numCartoesAmarelos = numCartoesAmarelos;
    }

    public int getNumCartoesVermelhos() {
        return numCartoesVermelhos;
    }

    public void setNumCartoesVermelhos(int numCartoesVermelhos) {
        this.numCartoesVermelhos = numCartoesVermelhos;
    }

    public int calculaPontos(){
        return (this.numVitorias * 3) + (this.numEmpates);
    }

    @Override
    public int compareTo(TimeFutebol o){
        TimeFutebol time = o; 

        if (time.calculaPontos() < this.calculaPontos()){
            return -1;
        }
        if (time.calculaPontos() > this.calculaPontos()){
            return 1;
        }

        if (time.getNumVitorias() < this.numVitorias){
            return -1;
        }
        if (time.getNumVitorias() > this.numVitorias){
            return 1;
        }

        if ((time.getNumGolsMarcados() - time.getNumGolsSofridos()) < (this.getNumGolsMarcados() - this.getNumGolsSofridos())){
            return -1;
        }
        if ((time.getNumGolsMarcados() - time.getNumGolsSofridos()) > (this.getNumGolsMarcados() - this.getNumGolsSofridos())){
            return 1;
        }

        if (time.getNumGolsMarcados() < this.numGolsMarcados){
            return -1;
        }
        if (time.getNumGolsMarcados() > this.numGolsMarcados){
            return 1;
        }

        if (time.getNumCartoesVermelhos() < this.numCartoesVermelhos){
            return -1;
        }
        if (time.getNumCartoesVermelhos() > this.numCartoesVermelhos){
            return 1;
        }

        if (time.getNumCartoesAmarelos() < this.numCartoesAmarelos){
            return -1;
        }
        if (time.getNumCartoesAmarelos() > this.numCartoesAmarelos){
            return 1;
        }

        //Sorteio
        Random randGen = new Random();
        int n = randGen.nextInt(100);

        if (n%2 == 1) System.out.println("Time vitorioso: " + this.nomeTime);
        else System.out.println("Time vitorioso: " + time.getNomeTime());

        return 0;
    }

}
