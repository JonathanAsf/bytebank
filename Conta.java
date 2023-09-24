package bytebank_composto;

public class Conta {
		private double saldo;
		private int agencia;
		private int numero;
		public Cliente titular;
		
		//Metodo de depósito
		void deposito(double valor) {
			this.saldo += valor;
		}
		//Metodo de saque
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
		//Metodo de transferencia
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
		//Metodo exibir saldo
		public double getSaldo() {
			return this.saldo;
		}
		
		//Metodos agencia
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public int getAgencia() {
			return this.agencia;
		}
		//Metodo de set numero da conta
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
}

