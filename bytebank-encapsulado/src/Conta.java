public class Conta {

	// Usando encapsulamento, a própria classe consegue controlar os atributos por meio
	// dos getters e setters. Isso é bom quando houver mudanças de regras de negócio
	// porque não precisaríamos procurar todos os lugares em que o atributo é setado ou recuperado
	// é só alterar no próprio método get/set da classe.
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Static: é global, não só da classe
	private static int total = 0;
	
	// Construtor padrão, já existe sempre quando não há mais nenhum especificado
	public Conta() {
		
	}
	
	public Conta (int agencia, int numero) {
		total++;
		System.out.println(total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
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
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <=0) {
			System.out.println("Não pode valor negativo");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <=0) {
			System.out.println("Não pode valor negativo");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	// Método estático não tem acesso a atributos não estáticos
	public static int getTotal() {
		return total;
	}

}
