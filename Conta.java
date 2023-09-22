package bytebank;

public class Conta {
		double saldo;
		int agencia;
		int numero;
		String titular;
		
		void deposito(double valor) {
			this.saldo += valor;
		}
	}

