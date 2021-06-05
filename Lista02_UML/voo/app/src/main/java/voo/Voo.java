package voo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voo{
    private List<Integer> assentosLivres = new ArrayList<Integer>();
    private int codigo;
    private int quantidadeTotalAssentos;
    private double horario;
    private Date data;
    private Aeroporto aeroportoPartida;
    private Aeroporto aeroportoDestino;
    private List<Aeroviario> aeroviarios = new ArrayList<Aeroviario>();


    public Voo(List assentosLivres, int codigo, int quantidadeTotalAssentos, double horario, Date data, 
             Aeroporto aeroportoPartida, Aeroporto aeroportoDestino, List<Aeroviario> aeroviarios) {
        this.assentosLivres = assentosLivres;
        this.codigo = codigo;
        this.quantidadeTotalAssentos = quantidadeTotalAssentos;
        this.horario = horario;
        this.data = data;
        this.aeroportoPartida = aeroportoPartida;
        this.aeroportoDestino = aeroportoDestino;
        this.aeroviarios = aeroviarios;
    }

    public List getAssentosLivres() {
        return assentosLivres;
    }

    public void setAssentosLivres(List assentosLivres) {
        this.assentosLivres = assentosLivres;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeTotalAssentos() {
        return quantidadeTotalAssentos;
    }

    public void setQuantidadeTotalAssentos(int quantidadeTotalAssentos) {
        this.quantidadeTotalAssentos = quantidadeTotalAssentos;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aeroporto getAeroportoPartida() {
        return aeroportoPartida;
    }

    public void setAeroportoPartida(Aeroporto aeroportoPartida) {
        this.aeroportoPartida = aeroportoPartida;
    }

    public Aeroporto getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(Aeroporto aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }

    public List<Aeroviario> getAeroviarios() {
        return aeroviarios;
    }

    public void setAeroviarios(List<Aeroviario> aeroviarios) {
        this.aeroviarios = aeroviarios;
    }


}
