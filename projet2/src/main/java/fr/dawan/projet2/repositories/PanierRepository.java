package fr.dawan.projet2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import fr.dawan.projet2.entities.Panier;
import fr.dawan.projet2.enums.EtatPanier;

public interface PanierRepository extends JpaRepository<Panier, Long> {
	
	@org.springframework.data.jpa.repository.Query (value="Select count(id) from Panier where EtatPanier = ':ep' or EtatPanier like '%:ep%'")
	int nbPanierByEtat(@Param("ep") EtatPanier ep);
	
	@org.springframework.data.jpa.repository.Query (value="Select count(id) from paniers where etat_panier like '%:ep%' or etat_panier = ':ep'",nativeQuery = true)
	int nbPanierByEtat2(@Param("ep") String ep);
	
	
	@org.springframework.data.jpa.repository.Query (value="Select count(id) from paniers where etat_panier like ':ep'",nativeQuery = true)
	int nbPanierByEtat3(@Param("ep") EtatPanier ep);
	
	/*
	@Query(nativeQuery = true,value = "Select sum(prix) from articles join vente_articles on vente_articles.panier where id = :id")
	double CalculTotal2(@Param("id") long idPanier);
	*/
	/*
	@Procedure
	int get_count_by_prix(@Param("montant") double montant);
	*/
	
	@org.springframework.data.jpa.repository.Query (value="Select count(distinct(id)) from paniers where etat_panier like \':ep\'",nativeQuery = true)
	int NbPanierByEtat(@Param("ep") String ep);
}
