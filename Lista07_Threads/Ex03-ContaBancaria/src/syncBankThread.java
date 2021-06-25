public class syncBankThread extends Thread{
    private ContaCliente cConta;

    public syncBankThread(ContaCliente cConta) {
        this.cConta = cConta;
    }

    public void run(){
        this.cConta.syncAcaoThread();    
    }
}
