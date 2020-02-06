
// Quem estende de Throwable é a máquina virtual java

// Exceção Unchecked:
//public class MinhaExcecao extends RuntimeException {
// Exceção checked, precisa colocar na assinatura do método que a lança:
public class MinhaExcecao extends Exception {
	
	public MinhaExcecao(String msg) {
		super(msg);
	}

}
