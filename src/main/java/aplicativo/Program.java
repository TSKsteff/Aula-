package aplicativo;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		/**
		Pessoa p1 = new Pessoa(1,"Ritz", "ritz@gmail.com");
		Pessoa p2 = new Pessoa( 2,"Ted", "ted@gmail.com");
		Pessoa p3 = new Pessoa(3,"Steff", "steff@gmail.com");
		Pessoa p4 = new Pessoa( 4,"Piard", "piard@gmail.com");
		*/

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		/**
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.getTransaction().commit();*/

		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println(p);
		System.out.println("Pronto");
		em.close();
		emf.close();
		
		
	}
}
