package br.com.bytebank.banco.modelo;

//Uma classe abstrata pode ter atributos? Sim! São eles que serão herdados pelas classes filhas. 
//Ela pode ter construtores? Sim! Estes construtores não são herdados diretamente, 
//mas podem ser chamados em classes filhas por meio do super. 
//A classe abstrata pode ter métodos? Sim! E os filhos herdam estas funcionalidades.
//Tudo continua válido, a única vedação é o instanciamento de objetos do tipo da classe abstrata.

/**
* Classe representa a moldura de uma conta
*
*@author Mariana Tancredi
*
*/

public abstract class Conta {

	// Usando encapsulamento, a própria classe consegue controlar os atributos por meio
	// dos getters e setters. Isso é bom quando houver mudanças de regras de negócio
	// porque não precisaríamos procurar todos os lugares em que o atributo é setado ou recuperado
	// é só alterar no próprio método get/set da classe.
	
	// Se tirar o encapsulamento, o atributo será package private
	double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Static: é global, não só da classe
	private static int total = 0;
	
	// Construtor padrão, já existe sempre quando não há mais nenhum especificado
	public Conta() {
		
	}
	
	/**
	* Construtor para inicializar o objeto a partir da agencia e numero.
	*
	*@param agencia
	*@param numero
	*/
	
	public Conta (int agencia, int numero) {
		System.out.println("Estou criando a conta " + numero);
		total++;
		System.out.println("Total de contas: " + total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	@Override 
	public String toString() { 
	    return "Numero: " + this.numero + "Agencia:" + this.agencia;
	}
	
	public abstract void deposita (double valor);
	//{
	//	this.saldo = this.saldo + valor;
	//}
	
	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			// return true;
		} else {
			// return false;
			throw new SaldoInsuficienteException("Saldo: "+ this.saldo + "Valor: " + valor);
		}
	}
	
	public void transfere(double valor, Conta contaDestino) {
		this.saca(valor);
		contaDestino.deposita(valor);
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
