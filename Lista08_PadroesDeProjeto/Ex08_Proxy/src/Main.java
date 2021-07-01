public class Main{
    public static void main(String[] args){

        System.out.println("----SISTEMA SEM PROXY----");
        Sistema sisNoProxy = new Sistema();
        //Sem proxy
        sisNoProxy.metodo1("laksdhfakoi2jois"); //sem codigo malicioso
        sisNoProxy.metodo1("8724689310237890129"); //com codigo malicioso
        sisNoProxy.metodo2("9876546541234nkjsfo1kas"); //sem codigo malicioso
        sisNoProxy.metodo2("aopvihwiu7891kjaskjhaksv"); //com codigo malicioso


        System.out.println("----FILTERED SISTEMA----");
        FilteredSistema fSistema = new FilteredSistema(sisNoProxy); //recebe sistema sem proxy
        //Mesmos parâmetros
        fSistema.metodo1("laksdhfakoi2jois"); //sem codigo malicioso
        fSistema.metodo1("8724689310237890129"); //com codigo malicioso
        fSistema.metodo2("9876546541234nkjsfo1kas"); //sem codigo malicioso
        fSistema.metodo2("aopvihwiu7891kjaskjhaksv"); //com codigo malicioso


        System.out.println("----SISTEMA COM PROXY----");
        SistemaProxy sisWithProxy = new SistemaProxy();
        //Mesmos parametros, com proxy
        sisWithProxy.metodo1("laksdhfakoi2jois"); //sem codigo malicioso
        sisWithProxy.metodo1("8724689310237890129"); //com codigo malicioso
        sisWithProxy.metodo2("9876546541234nkjsfo1kas"); //sem codigo malicioso
        sisWithProxy.metodo2("aopvihwiu7891kjaskjhaksv"); //com codigo malicioso

    }
}
