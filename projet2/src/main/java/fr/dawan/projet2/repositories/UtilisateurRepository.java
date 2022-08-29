package fr.dawan.projet2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projet2.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
