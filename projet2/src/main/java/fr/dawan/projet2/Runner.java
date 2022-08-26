package fr.dawan.projet2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import fr.dawan.projet2.entities.Adresse;
import fr.dawan.projet2.entities.Article;
import fr.dawan.projet2.entities.Avis_Article;
import fr.dawan.projet2.entities.Categorie;
import fr.dawan.projet2.entities.Marque;
import fr.dawan.projet2.entities.Panier;
import fr.dawan.projet2.entities.Utilisateur;
import fr.dawan.projet2.entities.Vente_Article;
import fr.dawan.projet2.enums.EtatPanier;
import fr.dawan.projet2.repository.AdresseRepo;
import fr.dawan.projet2.repository.ArticleRepo;
import fr.dawan.projet2.repository.Avis_ArticleRepo;
import fr.dawan.projet2.repository.CategorieRepo;
import fr.dawan.projet2.repository.MarqueRepo;
import fr.dawan.projet2.repository.PanierRepo;
import fr.dawan.projet2.repository.UtilisateurRepo;
import fr.dawan.projet2.repository.Vente_ArticleRepo;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	AdresseRepo adresseRepo;
	
	@Autowired
	UtilisateurRepo utilisateurRepo;
	
	@Autowired
	MarqueRepo marqueRepo;

	@Autowired
	CategorieRepo categorieRepo;

	@Autowired
	ArticleRepo articleRepo;

	@Autowired
	PanierRepo panierRepo;

	@Autowired
	Vente_ArticleRepo vente_ArticleRepo;

	@Autowired
	Avis_ArticleRepo avis_ArticleRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//-- MARQUE --//
		Marque marque1 = new Marque("Sony");
		marqueRepo.saveAndFlush(marque1);
		
		Marque marque2 = new Marque("Nintendo");
		marqueRepo.saveAndFlush(marque2);
		
		Marque marque3 = new Marque("MicroSoft");
		marqueRepo.saveAndFlush(marque3);
		
		Marque marque4 = new Marque("Atari");
		marqueRepo.saveAndFlush(marque4);
		
		//-- CATEGORIE --//
		Categorie categorie1 = new Categorie("Consoles");
		categorieRepo.saveAndFlush(categorie1);
		
		Categorie categorie2 = new Categorie("Jeux récents");
		categorieRepo.saveAndFlush(categorie2);
		
		Categorie categorie3 = new Categorie("Carte de paiement");
		categorieRepo.saveAndFlush(categorie3);

		Categorie categorie4 = new Categorie("Jeux rétros");
		categorieRepo.saveAndFlush(categorie4);

		Categorie categorie5 = new Categorie("Bornes");
		categorieRepo.saveAndFlush(categorie5);

		Categorie categorie6 = new Categorie("Manettes");
		categorieRepo.saveAndFlush(categorie6);

		Categorie categorie7 = new Categorie("Cables");
		categorieRepo.saveAndFlush(categorie7);
		
		Categorie categorie8 = new Categorie("Adaptateurs");
		categorieRepo.saveAndFlush(categorie8);
		
		//--  ADRESSES --//
		
		Adresse adresse1 = new Adresse(3, "rue terre-neuve", "80000", "chien");
		adresseRepo.saveAndFlush(adresse1);
		
		Adresse adresse2 = new Adresse(13, "rue terre-neuve", "80700", "cheval");
		adresseRepo.saveAndFlush(adresse2);
		
		Adresse adresse3 = new Adresse(23, "rue terre-neuve", "83000", "requin");
		adresseRepo.saveAndFlush(adresse3);
		
		Adresse adresse4 = new Adresse(15, "rue terre-neuve", "84000", "poney");
		adresseRepo.saveAndFlush(adresse4);
		
		Adresse adresse5 = new Adresse(5, "rue terre-neuve", "80025", "ane");
		adresseRepo.saveAndFlush(adresse5);
		
		//Adresse adresse6 = new Adresse(3, "rue terre-neuve", "80000", "singe");
		//adresseRepo.saveAndFlush(adresse6);
		
		Adresse adresse7 = new Adresse(13, "rue terre-neuve", "80700", "elephant");
		adresseRepo.saveAndFlush(adresse7);
		
		Adresse adresse8 = new Adresse(23, "rue terre-neuve", "83000", "hippopotame");
		adresseRepo.saveAndFlush(adresse8);
		
		Adresse adresse9 = new Adresse(15, "rue terre-neuve", "84000", "licorne");
		adresseRepo.saveAndFlush(adresse9);
		
		//Adresse adresse10 = new Adresse(5, "rue terre-neuve", "80025", "centaure");
		//adresseRepo.saveAndFlush(adresse10);
		
		//-- liste d'adresses --//
		
		List<Adresse> liste_adr1 = new ArrayList<>();
		liste_adr1.add(adresse1);
		
		List<Adresse> liste_adr2 = new ArrayList<>();
		liste_adr2.add(adresse3);
		liste_adr2.add(adresse5);
		
		List<Adresse> liste_adr3 = new ArrayList<>();
		liste_adr3.add(adresse1);
		liste_adr3.add(adresse7);
		
		List<Adresse> liste_adr4 = new ArrayList<>();
		liste_adr4.add(adresse8);
		liste_adr4.add(adresse9);
		
		//-- UTILISATEURS --//
		
		/*Utilisateur(String nom, String prenom, String email, String motPasse, String telephone,
		LocalDate dateInscription)*/
		
		Utilisateur user1 = new Utilisateur("nom1", "prenom1", "user1.user1@user.fr", "test","1234567890", LocalDate.now());
		user1.setAdmin(1);
		utilisateurRepo.saveAndFlush(user1);
		
		Utilisateur user2 = new Utilisateur("nom2", "prenom2", "user2.user2@user.fr", "test","1988998990", LocalDate.now());
		user2.setAdresseFacturation( liste_adr1 );
		user2.setAdresseLivraison(liste_adr2);
		utilisateurRepo.saveAndFlush(user2);
		
		Utilisateur user3 = new Utilisateur("nom3", "prenom3", "user3.use32@user.fr", "test","0770154438", LocalDate.now());
		user3.setAdresseFacturation( liste_adr3 );
		user3.setAdresseLivraison(liste_adr4);
		utilisateurRepo.saveAndFlush(user3);
		
		//Utilisateur user4 = new Utilisateur("nom4", "prenom4", "user4.user4@user.fr", "test","0770154438", LocalDate.now());
		//utilisateurRepo.saveAndFlush(user4);
		
		//-- ARTICLE --//
		/*Article(String nom, String description, double prix, byte[] photo, Categorie categorie, Marque marque,
			int quantite)*/
		
		 //File file = new File("//C:/tmp/6mb_file.wmv");
		 
		Article article1 = new Article("Nintendo DS","console d'occasion Nintendo DS grise",30.0,categorie1,marque2,3);
		articleRepo.saveAndFlush(article1);
		
		Article article2 = new Article("Nintendo 3DS","console d'occasion Nintendo 3DS bleue",25.0,categorie1,marque2,4);
		articleRepo.saveAndFlush(article2);
		
		Article article3 = new Article("PlayStation 1","console d'occasion PlayStation 1 grise",50.0,categorie1,marque1,3);
		articleRepo.saveAndFlush(article3);
		
		Article article4 = new Article("PlayStation 2","console d'occasion PlayStation 2 bleue",45.0,categorie1,marque1,4);
		articleRepo.saveAndFlush(article4);

		//--VENTE_ARTICLE--//
		Vente_Article va1 = new Vente_Article(article1, user2, 2);
		vente_ArticleRepo.saveAndFlush(va1);//60(30*2)
		
		Vente_Article va2 = new Vente_Article(article2, user2, 1);
		vente_ArticleRepo.saveAndFlush(va2);//25
		
		Vente_Article va3 = new Vente_Article(article4, user2, 2);
		vente_ArticleRepo.saveAndFlush(va3);//90(45*2)

		//-- liste d'articles --//
		List<Vente_Article> liste_articles1 = new ArrayList<>();
		liste_articles1.add(va1);
		liste_articles1.add(va2);	
		liste_articles1.add(va3);	
				
		System.out.println(liste_articles1.get(0).toString());
		System.out.println(liste_articles1.get(1).toString());
		//-- PANIER --//
		/*Panier(Utilisateur user, List<Article> articles, int quantite, double total,
			fr.dawan.projet2.enums.EtatPanier etatPanier, LocalDate dateValidation)
			*/
		
		Panier panier = new Panier(user2,liste_articles1,liste_articles1.get(0).getQte(),60.0,EtatPanier.VALIDE,LocalDate.now());
		panierRepo.saveAndFlush(panier);
		
		System.out.println(panierRepo.get_count_by_prix());
		//System.out.println(panierRepo.CalculTotal());
		//System.out.println(panierRepo.CalculTotal2(panier.getId()));
		
		//--AVIS_ARTICLE--//
		Avis_Article avis1 = new Avis_Article(article1, user2,"bon test", 2);
		avis_ArticleRepo.saveAndFlush(avis1);
	}


}
