import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String args[]) {

        ContaCliente cConta = new ContaCliente("Joao", "123456789", 1000000.00);
        bankThread bT = new bankThread(cConta);
        userThread uT = new userThread(cConta);

        System.out.println("Valor esperado da operação: 1500000.00");
       
        bT.start();                    
        uT.start();                    
        try{
            bT.join();
            uT.join();
        }catch(InterruptedException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Valor final sem sincronização: "+cConta.getSaldo());

        //syncBankThread e syncUserThread são idênticas à bankThread e à userThread, respectivamente,
        //tendo como única diferença chamarem syncAcaoThread de ContaCliente
        cConta = new ContaCliente("Jose", "987654321", 1000000.00);
        syncBankThread syncBT = new syncBankThread(cConta);
        syncUserThread syncUT = new syncUserThread(cConta);

        syncBT.start();
        syncUT.start();
        try{
            syncBT.join();
            syncUT.join();
        }catch(InterruptedException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Valor final com sincronização: "+cConta.getSaldo());
    }

}
