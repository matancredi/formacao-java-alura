package br.com.alura.gerenciador.servlet;
import java.util.ArrayList;
import java.util.Iterator;

import br.com.alura.gerenciador.servlet.Empresa;

public class Banco {
	
	static ArrayList<Empresa> lista = new ArrayList<>();
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
