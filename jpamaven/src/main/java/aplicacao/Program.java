package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pessoa p1 = new Pessoa(null, "Andre", "andre@email.com");
//		Pessoa p2 = new Pessoa(null, "Priscila", "priscila@email.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.getTransaction().commit();
		
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 1);
				
		System.out.println(p);
		em.remove(p);
		em.getTransaction().commit();
//		
		System.out.println("Pronto");
		
		em.close();
		emf.close();
		
//		System.out.println(p1);
//		System.out.println(p2);
	}

}
