package fr.dawan.projet2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.dawan.projet2.entities.Adresse;
import fr.dawan.projet2.entities.Utilisateur;
import fr.dawan.projet2.repositories.AdresseRepository;
import fr.dawan.projet2.repositories.UtilisateurRepository;

@SpringBootTest
class Projet2ApplicationTests {
	@Autowired
	UtilisateurRepository utilisateurRepository;
	@Autowired
	AdresseRepository adresseRepository;
	@Test
	void contextLoads() {
		Adresse adresse1 = new Adresse(3, "rue terre-neuve", "80000", "chien");
		adresseRepository.saveAndFlush(adresse1);
		
		Adresse adresse2 = new Adresse(13, "rue terre-neuve", "80700", "cheval");
		adresseRepository.saveAndFlush(adresse2);
		
		Adresse adresse3 = new Adresse(23, "rue terre-neuve", "83000", "requin");
		adresseRepository.saveAndFlush(adresse3);
		
		Adresse adresse4 = new Adresse(15, "rue terre-neuve", "84000", "poney");
		adresseRepository.saveAndFlush(adresse4);
		
		Adresse adresse5 = new Adresse(5, "rue terre-neuve", "80025", "ane");
		adresseRepository.saveAndFlush(adresse5);
		
		//Utilisateur(String nom, String prenom, String email, String motPasse, String telephone,
		//LocalDate dateInscription)
		Utilisateur user1 = new Utilisateur("nom1", "prenom1", "user1.user1@user.fr", "test","1234567890", LocalDate.now());
		user1.setAdmin(1);
		utilisateurRepository.saveAndFlush(user1);
		
		Utilisateur user2 = new Utilisateur("nom2", "prenom2", "user2.user2@user.fr", "test","1988998990", LocalDate.now());
		utilisateurRepository.saveAndFlush(user2);
	}

	
}
