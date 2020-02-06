public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException ex) {
        	//  É possível pegar mais informações sobre a exceção
        	String msg = ex.getMessage();
        	System.out.println("Exceção aritmética" + msg);
        	// Mostra a pilha
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
//		try {
			metodo2();
//		} catch (ArithmeticException ex) {
//	    	System.out.println("Exceção aritmética");
//		}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        try {
        	metodo2();
        } catch (Exception ex) {}
        System.out.println("Fim do metodo2");
    }
}