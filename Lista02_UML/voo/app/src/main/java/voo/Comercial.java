package voo;

import java.util.ArrayList;
import java.util.List;

public class Comercial{
    private TipoVoo tipoVoo;
    private List<Reserva> reservas = new ArrayList<Reserva>();

    public Comercial(TipoVoo tipoVoo, List<Reserva> reservas) {
        this.tipoVoo = tipoVoo;
        this.tipoVoo = tipoVoo;
    }

    public TipoVoo getTipoVoo() {
        return tipoVoo;
    }

    public void setTipoVoo(TipoVoo tipoVoo) {
        this.tipoVoo = tipoVoo;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void deleteReservas(int assento) {

    }
}
