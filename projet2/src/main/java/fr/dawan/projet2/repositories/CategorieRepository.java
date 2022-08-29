package fr.dawan.projet2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projet2.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
