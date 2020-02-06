package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";
		// Como String é um objeto, também é possível fazer (objeto literal):
		String nome2 = new String("Mariana");
		
//		Não funciona por causa da imutabilidade:
//		nome.replace("A", "a");
//		nome.toLowerCase();
		
		String outra = nome.replace("A",  "a");
		System.out.println(outra);
		outra = nome.toUpperCase();
		System.out.println(outra);
		char c = nome.charAt(2);
		System.out.println(c);
		int posicao = nome.indexOf('l');
		System.out.println(posicao);
		String sub = nome.substring(3);
		System.out.println(sub);
		int tamanho = nome.length();
		System.out.println(tamanho);
		System.out.println(nome.isEmpty());
		
		String vazio ="    Alura    ";
		String outroVazio = vazio.trim(); 

		System.out.println(outroVazio);
		System.out.println(nome.contains("ra"));

	}
	
}
