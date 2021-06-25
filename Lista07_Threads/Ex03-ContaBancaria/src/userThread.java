public class userThread extends Thread{
    private ContaCliente cConta;

    public userThread(ContaCliente cConta) {
        this.cConta = cConta;
    }

    public void run(){
        this.cConta.unsyncAcaoThread(); 
    }
}
