package fr.dawan.projet2.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="users")
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, length = 50)
	private String nom;
	
	@Column(nullable = false, length = 50)
	private String prenom;
	
	@Column(nullable = false, length = 250)
	private String email;

	@Column(nullable = false, length = 250)
	private String motPasse;
	
	private String telephone;
	
	private int admin = 0;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Adresse> adresseFacturation = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Adresse> adresseLivraison = new ArrayList<>();
	
	private LocalDate dateInscription;
	
	@Column(nullable = true)
	private LocalDate dateNaissance;
	
	@OneToOne
	private Panier panier;
	
	@Version
	private int version;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMotPasse() {
		return motPasse;
	}
	
	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public int getAdmin() {
		return admin;
	}
	
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	public List<Adresse> getAdresseFacturation() {
		return adresseFacturation;
	}
	
	public void setAdresseFacturation(List<Adresse> adresse1) {
		this.adresseFacturation = adresse1;
	}
	
	public List<Adresse> getAdresseLivraison() {
		return adresseLivraison;
	}
	
	public void setAdresseLivraison(List<Adresse> adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}
	
	public LocalDate getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(LocalDate dateInscription) {
		this.dateInscription = dateInscription;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Utilisateur(String nom, String prenom, String email, String motPasse, String telephone,
			LocalDate dateInscription) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motPasse = motPasse;
		this.telephone = telephone;
		this.dateInscription = dateInscription;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
