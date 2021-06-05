package SisOp;

public class TecladoJapones extends DriverTeclado{
    private String paramentroExclusivo;

    public TecladoJapones(boolean ligado, String paramentroExclusivo) {
        super(ligado);
        this.paramentroExclusivo = paramentroExclusivo;
    }

    public void funcaoExclusiva(){
        System.out.println("Mapa exclusivo de Teclado Japones");
        System.out.println("Parametro exclusivo: " + this.paramentroExclusivo); 
    }

}

