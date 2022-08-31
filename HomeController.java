package fr.dawan.projet1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.projet1.entities.Article;
import fr.dawan.projet1.forms.UserForm;
import fr.dawan.projet1.repositories.ArticleRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/")
	public String accueil() {
		return "home";
	}

	@GetMapping("/signIn")
	public String signIn(@ModelAttribute("formUser") UserForm userForm) {
		return "addUser";
	}
	/*
	private ArticleRepository ar;
	
	@PostMapping("/articles/{idCategorie}")
	public String listeArticles(@ModelAttribute("formArticles") ArticleForm articleForm, @PathVariable long idCategorie) {
		//articleForm.addAttribute("items", ar.ArticleByIdCategorie(idCategorie));
		return "listArticles/{idCategorie}";
	}*/
	@Autowired
	private ArticleRepository ar;
	
	@GetMapping(value = "/categories/{idCategorie}")
	public String listeArticles(@PathVariable long idCategorie,Model model) {
		model.addAttribute("articles", ar.ArticleByIdCategorie(idCategorie));
		List<Article> la =  ar.ArticleByIdCategorie(idCategorie);
		for(Article a : la) {
			System.out.println(a.getNom());
		}
		
		//ar.ArticleByIdCategorie(idCategorie).forEach(System.out::println);
		//return "redirect:/home/";
		return "listArticles_vue";
	}
	

	@GetMapping(value = "/article/{idArticle}")
	public String detailArticle(@PathVariable long idArticle,Model model) {
		
		Article a = ar.ArticleById(idArticle);
		
		model.addAttribute("article", a);
		/*
		List<Article> la =  ar.ArticleById(idArticle);
		for(Article a : la) {
			System.out.println(a.getNom());
		}
		*/
		//ar.ArticleByIdCategorie(idCategorie).forEach(System.out::println);
		System.out.println(a.getNom());
		//return "redirect:/home/";
		return "articleInfo_vue";
	}
}
