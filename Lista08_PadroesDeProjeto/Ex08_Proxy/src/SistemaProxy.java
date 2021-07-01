public class SistemaProxy{
    private Sistema sistema;

    public SistemaProxy(){
        this.sistema = new Sistema();
    }

    void metodo1(String string){
        
        if (string.contains("789")){
            throw new Error("ERRO!!! TENTATIVA DE ENVIO DE SUBSTRING MALICIOSA!");
        }
        else sistema.metodo1(string);
    }

    void metodo2(String string){
        
        if (string.contains("789")){
            throw new Error("ERRO!!! TENTATIVA DE ENVIO DE SUBSTRING MALICIOSA!");
        }
        else sistema.metodo2(string);
    }



}
