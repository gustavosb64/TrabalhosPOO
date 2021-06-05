package PegadaCarbono;

public class Carro implements PegadaDeCarbono{
    private String marca;
    private String placa;
    private double quilometragem;
    private Combustivel combustivel;

    public Carro(String marca, String placa, double quilometragem, Combustivel combustivel) {
        this.marca = marca;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    private void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public double getPegadaCarbono(){
        return (this.combustivel.getValorCombustivel() * this.quilometragem*0.7);
    }
}
