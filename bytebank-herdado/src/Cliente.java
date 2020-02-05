
public class Cliente implements Autenticavel{
	
	// private int senha;
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		// Esse relacionamento se chama composição
		// Cada classe existe de forma independente
		// Bom para reutilização de código
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}
	
	@Override
	public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
