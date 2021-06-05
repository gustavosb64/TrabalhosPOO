package voo;

public class Reserva{
    private Comercial vooComercial;
    private int codigoReserva;
    private Passageiro passageiro;
    private int assento;

    public Reserva(Comercial vooComercial, int codigoReserva, Passageiro passageiro, int assento) {
        this.vooComercial = vooComercial;
        this.codigoReserva = codigoReserva;
        this.passageiro = passageiro;
        this.assento = assento;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public Comercial getComercial() {
        return vooComercial;
    }

    public void setComercial(Comercial vooComercial) {
        this.vooComercial = vooComercial;
    }

}
