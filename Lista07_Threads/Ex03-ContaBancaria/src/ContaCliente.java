public class ContaCliente {
    private String nome; 
    private String cpf; 
    private double saldo;

    public ContaCliente(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public void unsyncAcaoThread(){
        double valor; 
        double temp;

        for (int i=0; i < 5000; i++){
            valor = 100;
            temp = this.getSaldo() + valor;
            this.deposita(valor);
        
            valor = 50;
            temp = this.getSaldo() - valor;
            this.saca(valor);
        }
    }

    //Função idêntica à unsyncAcaoThread, com synchronized
    synchronized public void syncAcaoThread(){
        double valor; 
        double temp;

        for (int i=0; i < 5000; i++){
            valor = 100;
            temp = this.getSaldo() + valor;
            this.deposita(valor);
        
            valor = 50;
            temp = this.getSaldo() - valor;
            this.saca(valor);
        }
    }


}
