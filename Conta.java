package bytebank;

public class Conta {
		double saldo;
		int agencia;
		int numero;
		String titular;

	//Método de depósito
		void deposito(double valor) {
			this.saldo += valor;
		}
	//Método de Saque
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
	//Método de Transferência
		public boolean transfere(double valor, Conta destino) {
			if(saldo>=valor) {
				this.saldo -= valor;
				destino.deposito(valor);
				System.out.println("Transferência concluída");
				return true;
			}else {
				System.out.println("Erro de transferência");
				return false;
			}
		}
}
