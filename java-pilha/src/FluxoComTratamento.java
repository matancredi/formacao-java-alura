public class FluxoComTratamento {

	// Aqui a assinatura do método não pecisa incluir o throws porque está usando try-catch
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | MinhaExcecao ex) {
        	//  É possível pegar mais informações sobre a exceção
        	String msg = ex.getMessage();
        	System.out.println("Exceção: " + msg);
        	// Mostra a pilha
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
//		try {
			metodo2();
//		} catch (ArithmeticException ex) {
//	    	System.out.println("Exceção aritmética");
//		}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("deu muito errado");
//        ArithmeticException exception = new ArithmeticException("Deu errado");
//        throw exception;
        // ou: throw new ArithmeticException();
        
        // System.out.println("Fim do metodo2");
    }
}