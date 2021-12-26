package main.java.com.basma.demo.springtestapp.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;


import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = " Categorie")
public class Categorie {
@ID
@GeneratedValue(Strategy= GenerationType.IDENTITY)
private String code;
		

@Column(name ="libelle")
	 private String libelle;
	
@OneToMany(mappedBy = "Categorie")
//visible
	 @Column(name ="Produit")
private Collectiont<Produit> produit;
		
	 
	 
	 
	 
	 
	 
	 // getters and setters
	public String getcode(){return code;}

	public void setcode(){this.code=code;}
	public String getlibelle(){return libelle;}

	public void setlibelle(){this.libelle=libelle;}
public void setProduits(List<Produit> produits) {
			this.produits = produits;
		}
		public List<Produit> getProduits() { return produits;}
		 List<Produit> setCommandes(List<Produit>) {this.produits=produits;}

		
   
	

	//constructor 
	public  Categorie (String code,String libelle,List<Produit> produits){
	this. code= code;
	this. libelle= libelle;
	this. produits= produits;
	}

}




		}}
