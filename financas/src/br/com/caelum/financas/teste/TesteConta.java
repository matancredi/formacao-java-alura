package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Mariana Tancredi");
		conta.setBanco("Caixa Econômica");
		conta.setAgencia("123");
		conta.setNumero("456");
		
		// EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
		EntityManager em = new JPAUtil().getEntityManager();
		// EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		// emf.close();
		
	}
	
}
