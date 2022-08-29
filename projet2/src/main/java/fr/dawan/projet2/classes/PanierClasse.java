package fr.dawan.projet2.classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.dawan.projet2.enums.EtatPanier;

public class PanierClasse {
	
	public int getNbPanierByEtat(String ep) {
		int nbPanier = 0;
		EntityManagerFactory emf = null;

		EntityManager em = null;

		try {

			emf = Persistence.createEntityManagerFactory("data_boutique");

			em = emf.createEntityManager();
			
			List<Long> max = em.createNativeQuery("Select count(distinct(id)) from paniers where etat_panier like \'"+ep+"\'")
					.getResultList();
			return max.size();
			
		} catch(Exception e) {
			System.out.println(e);
		}
		return nbPanier;
		
	}
	
}
