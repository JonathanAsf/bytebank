package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoJonathan = new Conta();
		contaDoJonathan.saldo = 100;
		contaDoJonathan.deposito(50);
		
		System.out.println("Saldo atual da conta= " + contaDoJonathan.saldo);
	}
}
