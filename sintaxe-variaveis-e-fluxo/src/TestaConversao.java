
public class TestaConversao {

	public static void main (String[] args) {
		double salario = 2000.03;
		
		// Usar cast
		int valor = (int) salario;
		System.out.println(valor);
		
		//Colocar l no final
		long numeroGrande = 23232323232l;
		short valorPequeno = 2536;
		byte b = 127;
		
		// Colocar f no final;
		float pi = 3.14f;
		
		System.out.println(numeroGrande);
		System.out.println(valorPequeno);
		System.out.println(b);
		System.out.println(pi);
	}
	
}
