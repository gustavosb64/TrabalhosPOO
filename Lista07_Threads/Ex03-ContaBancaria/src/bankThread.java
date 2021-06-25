public class bankThread extends Thread{
    private ContaCliente cConta;

    public bankThread(ContaCliente cConta) {
        this.cConta = cConta;
    }

    public void run(){
        this.cConta.unsyncAcaoThread();    
    }
}
