public class TesteContas {
	
	// Tratamento de exceções:
	// Resumindo: sabemos que existem exceções e que elas mudam o fluxo. 
	// Se soluções não forem encontradas dentro da pilha de execução, elas serão impressas no console.

    public static void main(String[] args) {
    	
        int a = 3;
        // java.lang.ArithmeticException
        // int b = a / 0;

        //instancia para testar exceção!!!!
        ContaCorrente conta = null;
        // java.lang.NullPointerException
        try {
        	conta.deposita(200.0);
        	// É possível trabalhar com mais um tipo de exceção usando o pipe
        } catch(ArithmeticException | NullPointerException ex) {
        	String msg = ex.getMessage();
        	System.out.println(msg);
        	ex.printStackTrace();
        }

        //instancia da conta corrente
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        //instancia da conta poupança
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);
    }
}