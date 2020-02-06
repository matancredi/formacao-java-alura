package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestaTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		// FQN = Nome Pacote . Nome Simples da Classe
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto cal = new CalculadorImposto();
		cal.registra(seguro);
		cal.registra(cc);
		System.out.println(cal.getTotalImposto());
		
		
	}
}
