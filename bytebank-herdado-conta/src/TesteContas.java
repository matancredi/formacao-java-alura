
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		// O método depoista não existe nas classes conta corrente e poupança, só na classe Conta
		// É possível usá-lo porque herdamos os métodos. Já para os construtores, devemos usar o "super"
		
		// Mesma coisa com o método transfere, que funciona por causa do polimorfismo, já que cp e cc são contas.
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		// Não é possível pois a classe conta é abstrata:
		//Conta a = new Conta();
	}
	
}
