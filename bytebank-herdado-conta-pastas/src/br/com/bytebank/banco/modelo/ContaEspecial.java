package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}
	
//	Modificadores de acesso/visibilidade
//	public:visível em todos os espaços
//	protected: visível dentro do pacote e público para os filhos
//	package private: visível apenas dentro do pacote
//	private: visível apenas dentro da classe
	
}
