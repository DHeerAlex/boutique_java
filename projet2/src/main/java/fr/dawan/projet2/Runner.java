package fr.dawan.projet2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.dawan.projet2.classes.CountNbArticle;
import fr.dawan.projet2.classes.PanierClasse;
import fr.dawan.projet2.entities.Adresse;
import fr.dawan.projet2.entities.Article;
import fr.dawan.projet2.entities.Avis_Article;
import fr.dawan.projet2.entities.Categorie;
import fr.dawan.projet2.entities.Marque;
import fr.dawan.projet2.entities.Panier;
import fr.dawan.projet2.entities.Utilisateur;
import fr.dawan.projet2.entities.Vente_Article;
import fr.dawan.projet2.enums.EtatPanier;
import fr.dawan.projet2.repositories.AdresseRepository;
import fr.dawan.projet2.repositories.ArticleRepository;
import fr.dawan.projet2.repositories.Avis_ArticleRepository;
import fr.dawan.projet2.repositories.CategorieRepository;
import fr.dawan.projet2.repositories.MarqueRepository;
import fr.dawan.projet2.repositories.PanierRepository;
import fr.dawan.projet2.repositories.UtilisateurRepository;
import fr.dawan.projet2.repositories.Vente_ArticleRepository;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	AdresseRepository adresseRepository;
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@Autowired
	MarqueRepository marqueRepository;

	@Autowired
	CategorieRepository categorieRepository;

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	PanierRepository panierRepository;

	@Autowired
	Vente_ArticleRepository vente_ArticleRepository;

	@Autowired
	Avis_ArticleRepository avis_ArticleRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//-- MARQUE --//
		Marque marque1 = new Marque("Sony");
		marqueRepository.saveAndFlush(marque1);
		
		Marque marque2 = new Marque("Nintendo");
		marqueRepository.saveAndFlush(marque2);
		
		Marque marque3 = new Marque("MicroSoft");
		marqueRepository.saveAndFlush(marque3);
		
		Marque marque4 = new Marque("Atari");
		marqueRepository.saveAndFlush(marque4);

		Marque marque5 = new Marque("Marque Inconnue");
		marqueRepository.saveAndFlush(marque5);
		
		Marque marque6 = new Marque("SEGA");
		marqueRepository.saveAndFlush(marque6);
		
		//-- CATEGORIE --//
		Categorie categorie1 = new Categorie("Consoles");
		categorieRepository.saveAndFlush(categorie1);
		
		Categorie categorie2 = new Categorie("Jeux récents");
		categorieRepository.saveAndFlush(categorie2);
		
		Categorie categorie3 = new Categorie("Carte de paiement");
		categorieRepository.saveAndFlush(categorie3);

		Categorie categorie4 = new Categorie("Jeux rétros");
		categorieRepository.saveAndFlush(categorie4);

		Categorie categorie5 = new Categorie("Bornes");
		categorieRepository.saveAndFlush(categorie5);

		Categorie categorie6 = new Categorie("Manettes");
		categorieRepository.saveAndFlush(categorie6);

		Categorie categorie7 = new Categorie("Cables");
		categorieRepository.saveAndFlush(categorie7);
		
		Categorie categorie8 = new Categorie("Adaptateurs");
		categorieRepository.saveAndFlush(categorie8);
		
		//--  ADRESSES --//
		
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
		
		Adresse adresse6 = new Adresse(3, "rue terre-neuve", "80000", "singe");
		adresseRepository.saveAndFlush(adresse6);
		
		Adresse adresse7 = new Adresse(13, "rue terre-neuve", "80700", "elephant");
		adresseRepository.saveAndFlush(adresse7);
		
		Adresse adresse8 = new Adresse(23, "rue terre-neuve", "83000", "hippopotame");
		adresseRepository.saveAndFlush(adresse8);
		
		Adresse adresse9 = new Adresse(15, "rue terre-neuve", "84000", "licorne");
		adresseRepository.saveAndFlush(adresse9);
		
		Adresse adresse10 = new Adresse(5, "rue terre-neuve", "80025", "centaure");
		adresseRepository.saveAndFlush(adresse10);
		
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
		

		List<Adresse> liste_adr5 = new ArrayList<>();
		liste_adr5.add(adresse6);

		List<Adresse> liste_adr6 = new ArrayList<>();
		liste_adr6.add(adresse10);
		
		//-- UTILISATEURS --//
		
		/*Utilisateur(String nom, String prenom, String email, String motPasse, String telephone,
		LocalDate dateInscription)*/
		
		Utilisateur user1 = new Utilisateur("nom1", "prenom1", "user1.user1@user.fr", "test","1234567890", LocalDate.now());
		user1.setAdmin(1);
		utilisateurRepository.saveAndFlush(user1);
		
		Utilisateur user2 = new Utilisateur("nom2", "prenom2", "user2.user2@user.fr", "test","1988998990", LocalDate.now());
		//user2.setAdresseFacturation( liste_adr1 );
		//user2.setAdresseLivraison(liste_adr2);
		utilisateurRepository.saveAndFlush(user2);
		
		Utilisateur user3 = new Utilisateur("nom3", "prenom3", "user3.use32@user.fr", "test","0770154438", LocalDate.now());
		//user3.setAdresseFacturation( liste_adr3 );
		//user3.setAdresseLivraison(liste_adr4);
		utilisateurRepository.saveAndFlush(user3);
		
		Utilisateur user4 = new Utilisateur("nom4", "prenom4", "user4.user4@user.fr", "test","0770154438", LocalDate.now());
		//user4.setAdresseFacturation( liste_adr5 );
		//user4.setAdresseLivraison(liste_adr6);
		utilisateurRepository.saveAndFlush(user4);
		
		//-- ARTICLE --//
		/*Article(String nom, String description, double prix, byte[] photo, Categorie categorie, Marque marque,
			int quantite)*/
		
		 
		Article article1 = new Article("Nintendo DS","console d'occasion Nintendo DS grise",30.0,categorie1,marque2,3);
		articleRepository.saveAndFlush(article1);

		Article article2 = new Article("Nintendo 3DS","console d'occasion Nintendo 3DS bleue",25.0,categorie1,marque2,4);
		articleRepository.saveAndFlush(article2);

		Article article9 = new Article("Nintendo Switch","console d'occasion Nintendo Switch bleue",45.0,categorie1,marque2,4);
		articleRepository.saveAndFlush(article9);
		
		Article article10 = new Article("Nintendo Wii U","console d'occasion Nintendo Wii U bleue",50.0,categorie1,marque2,4);
		articleRepository.saveAndFlush(article10);

		Article article11 = new Article("Splatoon Wii U","Jeu Splatoon",25.0,categorie2,marque2,3);
		articleRepository.saveAndFlush(article11);
		
		Article article12 = new Article("Fatal Labyrinth","Jeu Fatal Labyrinth MegaDrive",15.0,categorie4,marque6,3);
		articleRepository.saveAndFlush(article12);
		
		Article article13 = new Article("Abonnement XBox","Abonnement Xbox live gold",45.0,categorie3,marque3,3);
		articleRepository.saveAndFlush(article13);
		
		Article article14 = new Article("Abonnement PSLive","Abonnement PlayStation live ",30.0,categorie3,marque1,3);
		articleRepository.saveAndFlush(article14);
		
		Article article3 = new Article("PlayStation 1","console d'occasion PlayStation 1 grise",50.0,categorie1,marque1,3);
		article3.setPromo(48);
		articleRepository.saveAndFlush(article3);
		
		Article article4 = new Article("PlayStation 2","console d'occasion PlayStation 2 bleue",45.0,categorie1,marque1,4);
		articleRepository.saveAndFlush(article4);
		
		Article article5 = new Article("PSP","console d'occasion PSP bleue",45.0,categorie1,marque1,2);
		articleRepository.saveAndFlush(article5);
		
		Article article15 = new Article("XBox One","console d'occasion Xbox One",45.0,categorie1,marque3,2);
		articleRepository.saveAndFlush(article15);
		
		Article article6 = new Article("Borne arcade shooter","borne arcade shooter",175.0,categorie5,marque5,3);
		article6.setPromo(166);
		articleRepository.saveAndFlush(article6);
		
		Article article7 = new Article("Borne arcade","borne arcade normale",150.0,categorie5,marque5,7);
		articleRepository.saveAndFlush(article7);
		
		Article article8 = new Article("Borne arcade musicale","Borne arcade musicale",200.0,categorie5,marque5,1);
		articleRepository.saveAndFlush(article8);

		//--VENTE_ARTICLE--//
		Vente_Article va1 = new Vente_Article(article1, user2, 2);
		vente_ArticleRepository.saveAndFlush(va1);//60(30*2)
		
		Vente_Article va2 = new Vente_Article(article2, user2, 1);
		vente_ArticleRepository.saveAndFlush(va2);//25
		
		Vente_Article va3 = new Vente_Article(article4, user2, 2);
		vente_ArticleRepository.saveAndFlush(va3);//90(45*2)
		
		Vente_Article va4 = new Vente_Article(article6, user3, 1);
		vente_ArticleRepository.saveAndFlush(va4);//175
		
		Vente_Article va5 = new Vente_Article(article7, user3,2);
		vente_ArticleRepository.saveAndFlush(va5);//(150*2)300
		
		Vente_Article va6 = new Vente_Article(article8, user3, 1);
		vente_ArticleRepository.saveAndFlush(va6);//200

		//-- liste d'articles --//
		List<Vente_Article> liste_articles1 = new ArrayList<>();
		liste_articles1.add(va1);
		liste_articles1.add(va2);	
		liste_articles1.add(va3);	
		
		List<Vente_Article> liste_articles2 = new ArrayList<>();
		liste_articles2.add(va4);
		liste_articles2.add(va5);	
		liste_articles2.add(va6);
				
		
		//-- PANIER --//
		/*Panier(Utilisateur user, List<Article> articles, int quantite, double total,
			fr.dawan.projet2.enums.EtatPanier etatPanier, LocalDate dateValidation)
			*/
		
		CountNbArticle cnba = new CountNbArticle();
		
		Panier panier = new Panier(user2,liste_articles1,cnba.CountNbArticles(liste_articles1),cnba.CountTotalPanier(liste_articles1),EtatPanier.VALIDE,LocalDate.now());
		panierRepository.saveAndFlush(panier);
		
		Panier panier2 = new Panier(user3,liste_articles2,cnba.CountNbArticles(liste_articles2),cnba.CountTotalPanier(liste_articles2),EtatPanier.EN_COURS,LocalDate.now());
		panierRepository.saveAndFlush(panier2);

		
		
		//System.out.println(panierRepo.get_count_by_prix());
		//System.out.println(panierRepo.CalculTotal());
		//System.out.println(panierRepo.CalculTotal2(panier.getId()));
		
		//--AVIS_ARTICLE--//
		Avis_Article avis1 = new Avis_Article(article1, user2,"bon test", 2);
		avis_ArticleRepository.saveAndFlush(avis1);
		
		Avis_Article avis2 = new Avis_Article(article6, user4,"bon achat", -1);
		avis_ArticleRepository.saveAndFlush(avis2);
		
		System.out.println("--- ArticleByCategorie -----");
		List<Article> listeTestCategorie = articleRepository.ArticleByCategorie(categorie5);
		for(Article unArticle : listeTestCategorie) {
			System.out.println(unArticle.getNom());
		}
		System.out.println("--- ArticleByCategorie_Marque -----");
		List<Article> listeTestCat_Marque = articleRepository.ArticleByMarqueAndCategorie(marque3,categorie1);
		for(Article unArticle : listeTestCat_Marque) {
			System.out.println(unArticle.getNom());
		}
		System.out.println("--- ArticleByMarque -----");
		List<Article> listeTestMarque = articleRepository.ArticleByMarque(marque1);
		for(Article unArticle2 : listeTestMarque) {
			System.out.println(unArticle2.getNom());
		}
		System.out.println("--- ArticleWithPromo -----");

		List<Article> listeTestPromo = articleRepository.ArticleWithPromo();
		for(Article unArticle3 : listeTestPromo) {
			System.out.println(unArticle3.getNom());
		}
		System.out.println("--- nbPanierByEtat -----1/2");
		PanierClasse panier_classe = new PanierClasse();
		System.out.println(panier_classe.getNbPanierByEtat(EtatPanier.VALIDE.toString()));
		
		System.out.println(panierRepository.NbPanierByEtat(EtatPanier.VALIDE.toString()));
		
		System.out.println("--- isEnStock_Articles ----probleme");
		
		List<Panier> listePanier = panierRepository.findAll();
		/*List<Vente_Article> lva = new ArrayList<>();
		for(Panier unPanier : listePanier) {
			//lva = unPanier.getArticles();
			/*
			for(Vente_Article va : lva) {
				System.out.println(va.toString());
			}*/
			//System.out.println(listePanier.size());
			//System.out.println(lva.size());
			//System.out.println(unPanier.toString());
			//System.out.println(cnba.isEnStock_Articles(unPanier, article8));
		//}
		
		
		
		System.out.println("--- listePanier.size() ----");
		System.out.println(listePanier.size());
		//System.out.println(lva.size());
		/*boolean result = cnba.isEnStock_Articles(listePanier,article8);*/
		
	}


}
