package PegadaCarbono;

public enum Combustivel {
    GASOLINA(3), ALCOOL(2), ELETRICO(1); 

    private int valorCombustivel;
    Combustivel(int valor){
        valorCombustivel = valor;
    }

    public int getValorCombustivel(){
        return valorCombustivel;
    }
}
