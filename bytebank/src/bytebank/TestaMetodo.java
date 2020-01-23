package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 1000;
		conta.deposita(500);
		System.out.println(conta.saldo);
		System.out.println(conta.saca(1000));
		System.out.println(conta.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		if (conta2.transfere(50, conta)) {
			System.out.println("feito");
		} else {
			System.out.println("saldo insuficiente");
		}
		
		System.out.println(conta.saldo);
		System.out.println(conta2.saldo);
		
		conta.titular = "Mariana Tancredi";
		System.out.println(conta.titular);
		
	}
}
