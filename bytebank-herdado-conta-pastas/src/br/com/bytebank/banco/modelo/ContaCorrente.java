package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
    	// Passando os atributos no super, estamos escolhendo qual construtor da classe mãe iremos utilizar
    	super(agencia, numero);
    }
    
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
	
    //Overrride confere se a função existe mesmo na classe mãe para ser sobreescrita e retorna erro se tiver alguma coisa errada
    @Override
    public void saca(double valor) {
    	// Cada saque vai custar 20 centavos se a conta for corrente
    	double valorASacar = valor + 0.2;
    	super.saca(valorASacar);
    }
    
    @Override
    public double getValorImposto() {
    	return super.saldo * 0.01;
    }
}
