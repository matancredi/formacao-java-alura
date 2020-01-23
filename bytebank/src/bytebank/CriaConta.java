package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		
		// Substitui a referência
		primeiraConta = segundaConta;
		segundaConta.saldo = 1000;
		System.out.println(primeiraConta.saldo);
		
		// Aqui não substitui as referências
		int a = 1;
		int b = 2;
		a = b;
		b = 3;
		System.out.println(a);
	}
}
