package fr.dawan.projet2.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="vente_articles")
public class Vente_Article implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne
	private Article article;
	
	@OneToOne
	private Utilisateur user;
	
	@Column(nullable=false)
	private int qte;
	
	@Version
	private int version;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Vente_Article(Article article, Utilisateur user, int qte) {
		super();
		this.article = article;
		this.user = user;
		this.qte = qte;
	}
	public Vente_Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Vente_Article(long id, Article article, Utilisateur user, int qte) {
		super();
		this.id = id;
		this.article = article;
		this.user = user;
		this.qte = qte;
	}
	@Override
	public String toString() {
		return "Vente_Article [id=" + id + ", article=" + article.getNom() + ", user=" + user.getNom() + ", qte=" + qte + "]";
	}
	
	
}
