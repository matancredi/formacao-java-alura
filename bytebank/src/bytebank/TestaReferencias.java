package bytebank;

public class TestaReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		primeiraConta.saldo = 500;
		
		//Saldo da primeira mudou e da segunda também, porque está apontando para o mesmo endereço/referência
		System.out.println(segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São iguais");
		}
		
		// Imprimir endereço de memória
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
