package PegadaCarbono;

public class Bicicleta implements PegadaDeCarbono{
    private String marca;
    private double aro; 
    private double calibragem; 

    public Bicicleta(String marca, double aro, double calibragem) {
        this.marca = marca;
        this.aro = aro;
        this.calibragem = calibragem;
    }

    public String getMarca() {
        return marca;
    }

    public double getAro() {
        return aro;
    }

    public double getCalibragem() {
        return calibragem;
    }

    public void setCalibragem(double calibragem) {
        this.calibragem = calibragem;
    }

    public double getPegadaCarbono(){
        return 0;
    }

}

