package fr.dawan.projet2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projet2.entities.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie, Long> {

}
