package br.com.caelum.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	// Estados da entidade no JPA:
	// - Transient: Novo objeto
	// - Managed: Após chamar o persist, até o em.close()
	// - Detached: Existe no banco, ams não está gerenciada pelo JPA, sendo necessário chamar o find() e merge()
	// - Removed: Não há mais representação ou registro no banco, mas a entidade continua em memória

}
