package bytebank;

public class Conta {
	double saldo;
	
	// Valor default do int é 0
	int agencia;
	//Pode ser definido um valor fixo assim:
	//int agencia = 3456;
	
	int numero;
	String titular;
	
	public void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			contaDestino.deposita(valor);
			return true;
		} else {
			return false;
		}
		
	}
}
