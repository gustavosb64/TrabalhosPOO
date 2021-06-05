package SisOp;

public class TecladoABNT extends DriverTeclado{
    private String paramentroExclusivo;

    public TecladoABNT(boolean ligado, String paramentroExclusivo) {
        super(ligado);
        this.paramentroExclusivo = paramentroExclusivo;
    }

    public void funcaoExclusiva(){
        System.out.println("Mapa exclusivo de Teclado ABNT");
        System.out.println("Parametro exclusivo: " + this.paramentroExclusivo); 
    }

}

