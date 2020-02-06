package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta{
	
	// Se eu não colocar nenhum construtor aqui, ele irá chamar o construtor padrão da classe-mãe
	// Que no caso, é o Conta().
	
	// Quando uma classe herda da outra, ela não recebe seus construtores, é necessário usar o "super"
	// Só herda métodos e atributos
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

}
