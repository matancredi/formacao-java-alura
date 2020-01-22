
public class TestaCondicionais {

	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 1;

		// Funciona sem chaves quando só tem uma linha
		if (idade >= 18) 
			System.out.println("Seja bem vindo");
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você pode entrar pq está acompanhado");
			}
			else
			System.out.println("Infelizmente você não pode entrar");
		}
		
	}

}
