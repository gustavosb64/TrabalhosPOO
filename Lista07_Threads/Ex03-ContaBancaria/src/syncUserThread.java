public class syncUserThread extends Thread{
    private ContaCliente cConta;

    public syncUserThread(ContaCliente cConta) {
        this.cConta = cConta;
    }

    public void run(){
        this.cConta.syncAcaoThread(); 
    }
}
