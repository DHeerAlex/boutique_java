package fr.dawan.projet2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projet2.entities.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {

}
