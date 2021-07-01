public class FilteredSistema extends Sistema{

    private Sistema sistema;

    public FilteredSistema(Sistema sistema){
        this.sistema = sistema;
    }

    void metodo1(String string){
        string = string.replaceAll("789","987");
        sistema.metodo1(string);
    }

    void metodo2(String string){
        string = string.replaceAll("789","987");
        sistema.metodo2(string);
    }


}
