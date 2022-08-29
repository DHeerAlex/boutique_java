package fr.dawan.projet2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.dawan.projet2.entities.Adresse;
import fr.dawan.projet2.repositories.AdresseRepository;

@SpringBootApplication
public class Projet2Application {
	@Autowired
	AdresseRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(Projet2Application.class, args);
		
		
		
		//Adresse adresse1 = new Adresse(3, "rue terre-neuve", "80000", "chien");
	    //adresse.setId(1);
	    //repo.saveAndFlush(adresse1);
	}

}
