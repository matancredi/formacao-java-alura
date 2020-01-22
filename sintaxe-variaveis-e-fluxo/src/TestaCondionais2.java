
public class TestaCondionais2 {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = false;
		
		//Outra opção:
		//acompanhado = quantidadePessoas >= 2;

		// Funciona sem chaves quando só tem uma linha
		if ((idade >= 18 || quantidadePessoas >= 2) && acompanhado)
			System.out.println("Seja bem vindo");
		else {

			System.out.println("Infelizmente você não pode entrar");
		}
	}

}
