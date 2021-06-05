package voo;

import java.util.Scanner;

public class Passageiro{
    private String nome;
    private int cpf;
    private Reserva reserva;
    private int numeroCartao;

    public Passageiro(String nome, int cpf, int numeroCartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.reserva = null;
        this.numeroCartao = numeroCartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void pedirReserva(Passageiro p){

        int assento;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual cadeira deseja reservar?");
        assento = (int) scan.nextInt();
        scan.close(); 

        Operadores op = new Operadores();
        op.fazerReserva(p, assento);

        return;
    }

    public void cancelaReserva(){
          
        this.reserva.setPassageiro(null);
        this.reserva.setAssento(-1);
        this.reserva = null;
    }

    public void pagarReserva(){

    }
}

