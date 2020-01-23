
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		
		// Não deixa sacar dinheiro que não tem
		//conta.saca(200);
		//System.out.println(conta.saldo);
		
		// Mas se a operação for feita dessa forma, o saldo fica negativo:
		//conta.saldo -= 101;
		//System.out.println(conta.saldo);
		
		// Para corrigir, será mudado o encapsulamento dos atributos
		// Assim, trabalharemos com as classes através de seus métodos, o que é mais seguro
		// Porque a interface já garante (ou deveria) que as validações necessárias sejam feitas
		
		System.out.println(conta.getSaldo());
		
	}
}
