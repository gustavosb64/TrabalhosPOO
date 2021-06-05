package SisOp;

public class DriverVideo implements InterfaceDispositivo {
    private boolean ligado;
    private int status;
    
    public void ligarDesligar(){
        if (this.ligado){
            this.ligado = false; 
            System.out.println("Desligado");
            return;
        }
        this.ligado = true; 
        System.out.println("Ligado");
    }

    public int getStatus(){
        return status;
    }

    public void calibrar(){
        System.out.println("Calibrado");
    }

}

