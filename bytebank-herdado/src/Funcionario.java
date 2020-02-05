
// Funcionário é abstrata já que não existe nenhuma pessoa na empresa que seja só funcionário
// Mas sim gerente, designer, etc. Então não deve ser possível instanciar um objeto do tipo funcionário
// Funcionário é um conceito abstrato

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	protected double salario;
	
	public Funcionario () {
		
	}
	
	// Cada classe concreta sobreescreverá esse método, mas ele ainda precisa existir aqui
	// Se classe tem um método abstrato, ela deverá ser abstrata
	public abstract double getBonificacao();
		// System.out.println("método bonificação funcionário");
		// return this.salario * 0.1;
	// }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	

}
