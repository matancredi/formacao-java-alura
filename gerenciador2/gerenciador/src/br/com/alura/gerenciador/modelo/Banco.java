package br.com.alura.gerenciador.modelo;
import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
	
	static ArrayList<Empresa> lista = new ArrayList<>();
	private static ArrayList<Usuario> listaUsuarios= new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Microsoft");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("IBM");
		empresa2.setId(chaveSequencial++);
		lista.add(empresa);
		lista.add(empresa2);
		
	    Usuario u1 = new Usuario();
	    u1.setLogin("nico");
	    u1.setSenha("12345");

	    Usuario u2 = new Usuario();
	    u2.setLogin("mariana");
	    u2.setSenha("12345");

	    listaUsuarios.add(u1);
	    listaUsuarios.add(u2);
	}
	
	public Usuario existeUsuario(String login, String senha) {
		for(Usuario u : listaUsuarios) {
			if(u.ehIgual(login,  senha)) {
				return u;
			}
		}
		return null;
	}
	
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				lista.remove(emp);
				return;
			}
		}
	}
	
	public Empresa buscaEmpresaPeloId(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	public ArrayList<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
