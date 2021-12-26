package main.java.springbootfirsttest.test.model;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = " commandes")
public class Commande {
@ID
@GeneratedValue(Strategy= GenerationType.IDENTITY)
private String numero ;
 
@Column(name ="date")
 private LocalDate date;
 @Column(name ="prixTotal")
 private BigDecimal prixTotal;
	 	  
@Column(name ="etat")
	  private Long etat;
	  
	  //many to one (*,1)
	  
@Column(name ="client")
	  private Client client;

	//one to many(1,*)
		//visible
		
@Column(name ="lignecommande")
	private List<LigneCommande> LigneCommande;




//getter/setter
	public String getnumero(){return numero;}

	public void setnumero(){this.numero=numero;}
	

	public LocalDate getdate(){return date ;}

	public void setdate(){this.date=date;}
	

	public BigDecimal getprixTotal(){return prixTotal;}

	public void setprixTotal(){this.prixTotal=prixTotal;}
	
	
	public Long getetat(){return etat;}

	public void setetat(){this.etat=etat;}		
		 
		public void setLigneCommandes(List<LigneCommande> lignecommandes) {
			this.commandes = commandes;
		}
		public List<Commande> getLigneCommandes() { return lignecommandes;}
		 List<LigneCommande> setLigneCommandes(List<LigneCommande>) {this.lignecommandes=lignecommandes;}

		

		//c onstructeur 
	public  Commande (String numero,LocalDate date,
	BigDecimal prixTotal,Long etat, List<LigneCommande> lignecommandes) {
			this. numero= numero;
	      this.date=date;

	     this.prixTotal= prixTotal;
	     this.etat=etat;
			this.lignecommandes = lignecommandes;
		}}
