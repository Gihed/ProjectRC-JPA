package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainJPA {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;

		try {

			emf = Persistence.createEntityManagerFactory("locationVoiture");
			em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();

			em.getTransaction().begin();
			Client c1 = new Client("rue decole", 52222214, "engaged", "elwafi", "permisB", "Ramzi 2", "5421547");
			Client c2 = new Client("rue decole", 52222274, "celibataire", "abdenebi", "permisB", "Firas 2", "5421557");

			em.persist(c1); // 1
			em.persist(c2); // 2
			
			Voiture v1 = new Voiture("Opel", "Meriva", 16, 2600, "excellent");
			Voiture v2 = new Voiture("BMW", "x5", 10, 26000, "Perfect");

			em.persist(v1); // 1
			em.persist(v2); // 2
			
			Contrat contrat1 = new Contrat(new Date(), new Date(), c1, v1);
			Contrat contrat2 = new Contrat(new Date(), new Date(), c2, v2);

			
			
			/*
			 * Liste des services
			 */
			
			Service s1 = new Service("service 1","001", null); 
			Service s2 = new Service("service 2","003", null); 
			Service s3 = new Service("service 3","003", null); 
			List<Service> listService = new ArrayList<>();
			listService.add(s1);
			listService.add(s2);
			contrat1.setServices(listService);
			List<Service> listService2 = new ArrayList<>();
			listService2.add(s3);
			contrat2.setServices(listService2);
			
			em.persist(contrat1); // 1
			em.persist(contrat2); // 2
			
			
			em.persist(s1);
			em.persist(s2);
			em.persist(s3);
			
			em.flush();

			em.getTransaction().commit();
			// em.close();
			
			

		} catch (Exception e) {
			// En "vrai" il faudrait affiner un peu plus...
			e.printStackTrace();
			if (em.getTransaction() != null) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

}
