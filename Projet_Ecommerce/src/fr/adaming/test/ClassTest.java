package fr.adaming.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.adaming.model.Client;


public class ClassTest {

	public static void main(String[] args){
		
		//emf
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		
		//em
		EntityManager em = emf.createEntityManager();
		
		//tx
		EntityTransaction tx = em.getTransaction();
		
		//ouvrir connexion 
		tx.begin();
		
		//instanciation des objets
		Client c1 = new Client("Clain", "fdsjkfdsh", "kljoz@klm", "12345", 110245);
		Client c2 = new Client("TOTO", "62 rue de la rue", "toto@g.com", "456123", 116791);
		Client c3 = new Client("Gon", "ile de la baleine", "gon@hxh.com", "hunter", 552364);
		Client c4 = new Client("Frodon", "26 hute de la compté", "lotr@hobbit.com", "anneau", 237894);
		Client c5 = new Client("Leonidas", "1 avenue de Sparte", "Spart@s.gc", "HAawooo", 300300);
		
		//persist
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		em.persist(c5);
		
		//commit
		tx.commit();
		
		//close
		em.close();
		emf.close();
	}
}
