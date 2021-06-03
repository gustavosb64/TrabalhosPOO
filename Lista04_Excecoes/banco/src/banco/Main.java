package banco;

public class Main {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(200, 300);
		
		try {
			conta.depositar(-10);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			conta.sacar(1000);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
