
public class TestaValores {
	public static void main(String[] args) {
		//Conta conta = new Conta();
		// conta.setAgencia(-50);
		// conta.setNumero(-100);
		Conta conta = new Conta(123,536);
		Conta conta2 = new Conta(123,537);
		
		System.out.println(Conta.getTotal());
		
	}
}
