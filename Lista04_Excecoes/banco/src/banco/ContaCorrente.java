package banco;

public class ContaCorrente {

	private double saldo;
	private double creditoLimite;
	
	public ContaCorrente(double saldo, double creditoLimite) {
		this.saldo = saldo;
		this.creditoLimite = creditoLimite;
	}
	
	public void sacar(double valor) {
		if(this.saldo + this.creditoLimite < valor) {
			throw new SaqueException("Valor indisponível!\nO valor inserido excede seu saldo e seu limite");
		}
		saldo -= valor;
		System.out.println("Saque realizado com sucesso!");
	}
	
	
	public void depositar(double valor) {
		if(valor <= 0) {
			throw new DepositarException("Valor inválido!\nInsira um valor positivo para depósito\n");
		}
		saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	}
	
	public void setValorLimite(double valor) {
		creditoLimite = valor;
	}
}
