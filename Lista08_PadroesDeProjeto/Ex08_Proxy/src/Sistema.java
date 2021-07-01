public class Sistema{

    void metodo1(String string){
        
        if (string.contains("789")){
            System.out.println("SUBSTRING MALICIOSA EXECUTADA!!!");
        }

        System.out.println("Método 1 sendo executado: "+string);
    }

    void metodo2(String string){
        
        if (string.contains("789")){
            System.out.println("SUBSTRING MALICIOSA EXECUTADA!!!");
        }

        System.out.println("Método 2 sendo executado: "+string);
    }

}
