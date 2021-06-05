package SisOp;

public abstract class DriverTeclado implements InterfaceDispositivo {
    private boolean ligado;
    private int status;

    DriverTeclado(boolean ligado){
        this.ligado = ligado;
        this.status = 1;
    }
    
    public void ligarDesligar(){

        this.ligado = !(this.ligado);
        if(this.status < 1) this.status = 1;
        else this.status = 0;

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

    public abstract void funcaoExclusiva();

}

