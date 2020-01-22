
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		// Não substitui o local/referência de memória
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
	}
	
}
