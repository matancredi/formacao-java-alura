
public class TesteFuncionario {
	public static void main(String[] args) {
		
		// Para instaciar uma classe abstrata, deve-se criar uma classe filha não abstrata:
		Gerente mariana = new Gerente();
		mariana.setNome("Mariana Tancredi");
		mariana.setCpf("01234567890");
		mariana.setSalario(2500);
		
		System.out.println(mariana.getNome());
		System.out.println(mariana.getBonificacao());
		System.out.println(mariana.getCpf());
		System.out.println(mariana.getBonificacao());
		
	}
}
