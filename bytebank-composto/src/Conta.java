public class Conta {

	//double saldo;
	private double saldo;
	int agencia;
	int numero;
	
	//Funcionaria mas não é pertinente às regras de negócio:
	// Cliente titular = new Cliente();
	
	Cliente titular;
	
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
	
	// Agora que os atributos são privados, é necessário ter os métodos get e set
	public double getSaldo(){
		return this.saldo;
	}
	
}
