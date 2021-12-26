package main.java.com.basma.demo.springtestapp.model;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = " LigneCommande")
public class LigneCommande {
@ID
@GeneratedValue(Strategy= GenerationType.IDENTITY)
@Column(name ="qte")
private Long qte;
@Column(name ="prixUnitaire")
	 private BigDecimal prixUnitaire;
	 @Column(name ="prixTotal")
	 private BigDecimal prixTotal;
	 @Column(name ="etat")
	  private Long etat;

		//visible
@Column(name ="commandes")
			
private Commande commande;
@Column(name ="produit")
	private Produit produit;
	
}
//getters and setters
public String  getQte() {
		return qte;
	}
	public void setQte(Long qte) {
		this.qte = qte;
	}
	public String getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public String getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(BigDecimal prixTotal) {
		this.prixTotal = prixTotal;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(Long etat) {
		this.etat = etat;
	}
	
		public Commande getCommande(){return commande;}

	public void setCommande(Commande commande){this.commande=commande;}

	public Produit getProduit(){return produit;}

	public void setProduit(Produit produit ){this.produit=produit;}

		
		
//constractor

		public LigneCommande(Long qte,BigDecimal prixUnitaire,
	BigDecimal prixTotal,Long etat,List<Commande> commande,Produit produit) {
			this. qte= qte;
	this.prixUnitaire=prixUnitaire;

	this.  prixTotal= prixTotal;
	this. etat=etat;
	this. commande=commande;
	this. produit=produit;
	
		}}
