package fr.dawan.projet2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.projet2.entities.Article;
import fr.dawan.projet2.entities.Categorie;
import fr.dawan.projet2.entities.Marque;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	
	@org.springframework.data.jpa.repository.Query ("select a from Article a where categorie = :id")
	List<Article> ArticleByCategorie(@Param("id") Categorie cat);
	
	@org.springframework.data.jpa.repository.Query ("select a from Article a where id = :id")
	List<Article> ArticleById(@Param("id") Long id);
	
	@org.springframework.data.jpa.repository.Query ("select a from Article a where marque = :id")
	List<Article> ArticleByMarque(@Param("id") Marque id);
	

	@org.springframework.data.jpa.repository.Query ("select a from Article a where promo != 0")
	List<Article> ArticleWithPromo();
	/*
	Article findById(Long id) {
		return em.find(Article.class, id);
	}*/
}

