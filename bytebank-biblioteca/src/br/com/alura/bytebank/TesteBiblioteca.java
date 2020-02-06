package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

//selecionamos o arquivo bytebank-1.0.jar na área do Package Explorer e 
//pressionamos o botão direito do mouse, e selecionamos as opções "Build Path > Add to Build Path".

public class TesteBiblioteca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 321);
		
	}
}
