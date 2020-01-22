
public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 3300.0;
		double aumento = 0.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			aumento = salario * 0.075;
		}
		
		if (salario >= 2800.01 && salario <= 3751.0) {
			aumento = salario * 0.15;
		}
		
		if (salario >= 3751.01 && salario <= 4664.00) {
			aumento = salario * 0.225;
		}
		
		System.out.println(salario+aumento);
		
	}
	
}
