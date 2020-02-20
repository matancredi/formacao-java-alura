package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteTodasAsMovimentacoesDasContas {

    public static void main(String[] args) {

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
        // Por padrão todos os relacionamentos [...]ToMany são Lazy;
        // Usamos o join fetch para carregar o relacionamento de forma Eager (em uma mesma query) ao usarmos JPQL
        // Por padrão, quando usamos um join, o Hibernate dispara no banco um inner join

        String jpql = "select distinct c from Conta c left join fetch c.movimentacoes";

        Query query = em.createQuery(jpql);

        List<Conta> todasAsContas = query.getResultList();

        for (Conta conta : todasAsContas) {
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Movimentacoes: ");
            System.out.println(conta.getMovimentacoes());
        }
    }
}
