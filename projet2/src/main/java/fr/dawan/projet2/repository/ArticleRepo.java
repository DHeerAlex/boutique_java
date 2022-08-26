package fr.dawan.projet2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projet2.entities.Article;

public interface ArticleRepo extends JpaRepository<Article, Long> {

}
