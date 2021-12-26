package  main.java.com.basma.demo.springtestapp.model;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = " clients")
public class Client {
@ID
@GeneratedValue(Strategy= GenerationType.IDENTITY)
private String code;
		

@Column(name ="nom")
private String nom;
@Column(name ="prenom")
private String Prenom;
@Column(name ="dateNaissance")
private LocalDate dateNaissance;
@Column(name ="adresse")
private String adresse;

@Column(name ="ville")
private String ville;

@Column(name ="codePostal")
private Long codePostal;

@Column(name ="tel")
 public String tel;

@Column(name ="fax")
public String fax;

@Column(name ="gsm")
private String gsm;
@Column(name ="email")
private String email;

		//visible
@Column(name ="commandes")
List<Commande> commandes;
			


		
		 public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return Prenom;
		}
		public void setPrenom(String prenom) {
			Prenom = prenom;
		}
		public LocalDate getDateNaissance() {
			return dateNaissance;
		}
		public void setDateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getVille() {
			return ville;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		public Long getCodePostal() {
			return codePostal;
		}
		public void setCodePostal(Long codePostal) {
			this.codePostal = codePostal;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getFax1() {
			return fax;
		}
		public void setFax1(String fax1) {
			this.fax = fax1;
		}
		public String getGsm() {
			return gsm;
		}
		public void setGsm(String gsm) {
			this.gsm = gsm;
		}
		public String getEmail1() {
			return email;
		}
		public void setEmail1(String email1) {
			this.email = email1;
		}
		public void setCommandes(List<Commande> commandes) {
			this.commandes = commandes;
		}
		public List<Commande> getCommandes() { return commandes;}
		 List<Commande> setCommandes(List<Commande>) {this.commandes=commandes;}

		

		public Client(String code, String nom, String prenom,
				LocalDate dateNaissance, String adresse, String ville,
				Long codePostal, String tel, String fax1, String gsm,
				String email1, List<Commande> commandes) {
			super();
			this.code = code;
			this.nom = nom;
			Prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.adresse = adresse;
			this.ville = ville;
			this.codePostal = codePostal;
			this.tel = tel;
			this.fax = fax1;
			this.gsm = gsm;
			this.email= email1;
			this.commandes = commandes;
		}}
