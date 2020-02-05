//A herança múltipla não é utilizada no Java porque poderia gerar confusão. 
//Imaginemos que a classe Funcionario tem uma senha, e um método setSenha(), como sabemos, 
//a classe Autenticavel possui exatamente isto. Se o Gerente estender ambas, qual dos dois prevalece? 
//Para evitar este tipo de problema, no Java, não há herança múltipla.

public class Gerente extends Funcionario implements Autenticavel{
	
	// private String nome;
	// private String cpf;
	// private double salario;
	//private int senha;
//	
//	public Gerente () {
//		
//	}
//	
//	public boolean autentica(int senha) {
//		if (this.senha == senha) {
//			return true;
//		}
//		return false;
//	}
	
	//Sobrecarga de métodos: Método com mesmo nome mas que recebe outros parâmetros
	
//	public boolean autentica (String login, int senha) {
//		// TODO: Colocar outra implementação aqui
//		return true;
//	}
//	
//	public void setSenha(int senha){
//		this.senha = senha;
//	}
	
	//Mesma assinatura do método na classe-mãe
	public double getBonificacao() {
		System.out.println("método bonificação gerente");
		//Colocar super porque salário é da classe-mãe, não da classe Gerente
		//Ao utilizar os métodos get, não é necessário que o atributo seja protected, ele pode ser private
		return super.getSalario() * 0.2;
	 }
	
	private AutenticacaoUtil autenticador;
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}
