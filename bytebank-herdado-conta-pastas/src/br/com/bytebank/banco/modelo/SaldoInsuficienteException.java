package br.com.bytebank.banco.modelo;

// Exceção unchecked
public class SaldoInsuficienteException extends RuntimeException{
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
