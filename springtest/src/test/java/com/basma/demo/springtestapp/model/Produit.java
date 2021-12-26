package main.java.com.basma.demo.springtestapp.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
//@Table(name = " clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
@ID
@GeneratedValue(Strategy= GenerationType.IDENTITY)
		
	//one to many(1,*)
	private String code ;
	  
@Column(name ="marque")
	 private String marque ;
	 @Column(name ="modele")
	 private String modele;
	 @Column(name ="caracteristiques")
	  private String caracteristiques;
	  @Column(name ="prixUnitaire")
	  private BigDecimal prixUnitaire;
	  @Column(name ="quantite")
	  private Long quantite;

	  


	  @ManyToOne(fetch = FetchType.EAGER)
	  private Categorie categorie;
	  //visible
//@Column(name ="commandes")
//List<Commande> commandes;
			

//getters and setters
	 public String getcode(){return code ;}

	public void setcode(){this.code=code ;}
	 
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCaracteristiques() {
		return caracteristiques;
	}

	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Long getQuantite() {
		return quantite;
	}

	public void setQuantite(Long quantit�) {
		this.quantite = quantite;
	}


		 
		public void setCommandes(List<Commande> commandes) {
			this.commandes = commandes;
		}
		public List<Commande> getCommandes() { return commandes;}
		 List<Commande> setCommandes(List<Commande>) {this.commandes=commandes;}

		

	//constructeur 
	public  Produit (String code,String marque, String modele,
	String caracteristiques,BigDecimal prixUnitaire, Long quantite, List<Commande> commandes) {
			this. code= code;
	
	this.  marque= marque;
	this. modele=modele;
	this.  caracteristiques= caracteristiques;
	this.prixUnitaire=prixUnitaire;

	this. quantite=quantite;
			this.commandes = commandes;
		}}
