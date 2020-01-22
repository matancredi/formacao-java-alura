
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("Meu salário é " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		//O resultado da divisão é truncado caso a variável seja int
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		//Mesmo se for double e os números usados forem inteiros
		double maisUmaDivisao = 5/2;
		System.out.println(maisUmaDivisao);
		
		//Agora sim
		double divisaoCerta = 5.0/2;
		System.out.println(divisaoCerta);
		
		//Assim também
		double divisaoCerta2 = 5/2.0;
		System.out.println(divisaoCerta2);
		
	}
	
}
