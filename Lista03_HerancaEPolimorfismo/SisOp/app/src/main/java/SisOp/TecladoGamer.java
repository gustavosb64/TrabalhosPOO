package SisOp;

public class TecladoGamer extends DriverTeclado{
    private String paramentroExclusivo;

    public TecladoGamer(boolean ligado, String paramentroExclusivo) {
        super(ligado);
        this.paramentroExclusivo = paramentroExclusivo;
    }

    public void funcaoExclusiva(){
        System.out.println("Funcoes exclusivas de Teclado Gamer");
        System.out.println("Parametro exclusivo: " + this.paramentroExclusivo); 
    }

}

