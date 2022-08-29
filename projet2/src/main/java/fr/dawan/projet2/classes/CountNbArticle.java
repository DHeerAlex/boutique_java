package fr.dawan.projet2.classes;

import java.util.ArrayList;
import java.util.List;

import fr.dawan.projet2.entities.Article;
import fr.dawan.projet2.entities.Panier;
import fr.dawan.projet2.entities.Vente_Article;

public class CountNbArticle {
	public int CountNbArticles(List<Vente_Article> liste) {
		int nbArticles = 0;
		for(Vente_Article va : liste){
			nbArticles += va.getQte();
		}
		
		return nbArticles;
	}
	
	public double CountTotalPanier(List<Vente_Article> liste) {
		int total = 0;
		
		for(Vente_Article va : liste){
			
			List<Article> listeArticles = new ArrayList<>();
			listeArticles.add(va.getArticle());
			
			for(Article article : listeArticles) {
				total += article.getPrix()*va.getQte();
			}
		}
		
		return total;
	}
	
	public boolean isEnStock_Articles(Panier panier,Article article) {
		boolean result = true;
			List<Vente_Article> listeVA = panier.getArticles();
			for(Vente_Article va : listeVA) {
				
				if(va.getArticle().getQuantite() >= article.getQuantite()) {
					System.out.println(va.getArticle().getQuantite());
					result = false;
					
				}
			}
		
		return result;
	}
}
