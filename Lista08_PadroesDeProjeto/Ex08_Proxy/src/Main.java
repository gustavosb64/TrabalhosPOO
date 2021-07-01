public class Main{

    public static void main(String[] args){
        Sistema sisNoProxy = new Sistema();
        SistemaProxy sisWithProxy = new SistemaProxy();

        //Sem proxy
        sisNoProxy.metodo1("laksdhfakoi2jois"); //sem codigo malicioso
        sisNoProxy.metodo1("8724689310237890129"); //com codigo malicioso
        sisNoProxy.metodo2("9876546541234nkjsfo1kas"); //sem codigo malicioso
        sisNoProxy.metodo2("aopvihwiu7891kjaskjhaksv"); //com codigo malicioso

        System.out.println("--------------------");

        //Mesmos parametros, com proxy
        sisWithProxy.metodo1("laksdhfakoi2jois"); //sem codigo malicioso
        sisWithProxy.metodo1("8724689310237890129"); //com codigo malicioso
        sisWithProxy.metodo2("9876546541234nkjsfo1kas"); //sem codigo malicioso
        sisWithProxy.metodo2("aopvihwiu7891kjaskjhaksv"); //com codigo malicioso


    }
}
