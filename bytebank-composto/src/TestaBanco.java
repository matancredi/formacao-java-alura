
public class TestaBanco {
	public static void main(String[] args) {
		Cliente mariana = new Cliente();
		mariana.nome = "Mariana Tancredi";
		mariana.cpf="01234567890";
		mariana.profissao="Analista de Sistemas";
		
		Conta contaMariana = new Conta();
		contaMariana.deposita(100);
		contaMariana.titular = mariana;
		
		System.out.println(contaMariana.titular);
		System.out.println(mariana);
	}
}
