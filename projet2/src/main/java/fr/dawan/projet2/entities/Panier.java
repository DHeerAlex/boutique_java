package fr.dawan.projet2.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import fr.dawan.projet2.enums.EtatPanier;

@Entity
@Table(name="paniers")
public class Panier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Utilisateur user;
	
	@OneToMany
	@Column(name="idVenteProduit")
	private List<Vente_Article> articles = new ArrayList<>();
	
	private int quantite;
	
	private double total;
	
	@Enumerated(EnumType.STRING)
	private EtatPanier EtatPanier;
	

	private LocalDate dateValidation;
	
	@Column(nullable = true)
	private LocalDate datePaiement;

	@Version
	private int version;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	public List<Vente_Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Vente_Article> articles) {
		this.articles = articles;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public EtatPanier getEtatPanier() {
		return EtatPanier;
	}

	public void setEtatPanier(EtatPanier etatPanier) {
		EtatPanier = etatPanier;
	}

	public LocalDate getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(LocalDate dateValidation) {
		this.dateValidation = dateValidation;
	}

	public LocalDate getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(LocalDate datePaiement) {
		this.datePaiement = datePaiement;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Panier(Utilisateur user, List<Vente_Article> idVentePanier, int quantite, double total,
			fr.dawan.projet2.enums.EtatPanier etatPanier, LocalDate dateValidation) {
		super();
		this.user = user;
		this.articles = idVentePanier;
		this.quantite = quantite;
		this.total = total;
		EtatPanier = etatPanier;
		this.dateValidation = dateValidation;
	}

	public Panier(long id, Utilisateur user, List<Vente_Article> articles, int quantite, double total,
			fr.dawan.projet2.enums.EtatPanier etatPanier, LocalDate dateValidation, LocalDate datePaiement) {
		super();
		this.id = id;
		this.user = user;
		this.articles = articles;
		this.quantite = quantite;
		this.total = total;
		EtatPanier = etatPanier;
		this.dateValidation = dateValidation;
		this.datePaiement = datePaiement;
	}

	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Panier [id=" + id + ", user=" + user + ", articles=" + articles + ", quantite=" + quantite + ", total="
				+ total + ", EtatPanier=" + EtatPanier + ", dateValidation=" + dateValidation + ", datePaiement="
				+ datePaiement + "]";
	}
	
	
}
