package fr.dawan.projet2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import fr.dawan.projet2.entities.Panier;

public interface PanierRepo extends JpaRepository<Panier, Long> {
	
	@Query(nativeQuery = true,value = "Select sum(prix) from articles a")
	double CalculTotal();
	
	/*
	@Query(nativeQuery = true,value = "Select sum(prix) from articles join vente_articles on vente_articles.panier where id = :id")
	double CalculTotal2(@Param("id") long idPanier);
	*/
	
	@Procedure
	int get_count_by_prix(@Param("montant") double montant);
}
