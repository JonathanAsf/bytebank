package bytebank;

public class Conta {
		double saldo;
		int agencia;
		int numero;
		String titular;
		
		void deposito(double valor) {
			this.saldo += valor;
		}
		
		public boolean saque(double valor) {
			if(this.saldo >= valor) {
				this.saldo -=  valor;
				System.out.println("Saque efetuado");
				System.out.println("Saldo atual da conta:" + this.saldo);
				return true;
			}else{
				System.out.println("Saldo insuficiente para saldo");
				return false;
			}
			
		}
}
