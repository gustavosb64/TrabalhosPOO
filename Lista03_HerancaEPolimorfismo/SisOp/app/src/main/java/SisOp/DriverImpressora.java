package SisOp;

public class DriverImpressora implements InterfaceDispositivo {
    private boolean ligado;
    private int status;

    DriverImpressora(boolean ligado){
        this.ligado = ligado;
        this.status = 0;
    }
    
    public void ligarDesligar(){

        this.ligado = !(this.ligado);
        if(this.status == 0) this.status = 1;

        if (this.ligado) System.out.println("O dispositivo foi ligado");
        else System.out.println("O dispositivo foi desligado");

        return;
    }

    public boolean getLigado(){
        return ligado;
    }

    public int getStatus(){
        return status;
    }

    public void calibrar(){
        System.out.println("Calibrado");
    }

}

