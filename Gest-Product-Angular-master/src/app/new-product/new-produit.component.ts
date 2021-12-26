import { Component, OnInit } from '@angular/core';
import {CatalogueService} from "../services/catalogue.service";
import {Router} from "@angular/router";
import {Produit} from "../model/product.model";

@Component({
  selector: 'app-new-produit',
  templateUrl: './new-produit.component.html',
  styleUrls: ['./new-produit.component.css']
})
export class NewProductComponent implements OnInit {
  categories: any;
  produits:any;
  size:number=5;
  currentPage:number=0
  totalPages:number=0
  pages:Array<number>;
  categorie:any;
  private  currentProduct:any;
  constructor(private service:CatalogueService, private router:Router) { }

  ngOnInit() {
    this.onGetProducts();
    this.service.findAllCategory().subscribe(data =>{
      this.categories=data ;
    },error=>{
      console.log(error);
    })
  }

  onGetProducts() {
    this.service.getProducts(this.currentPage, this.size).subscribe(data =>{
      this.totalPages=data["page"].totalPages;
      this.pages= new Array<number>(this.totalPages);
      this.produits=data ;
    },error=>{
      console.log(error);
    })
  }

  onProductPage(i: number) {
    this.currentPage=i;
    this.onGetProducts()
  }

  saveProduct(value) {

    this.service.findCategory(value.category).subscribe(data=>{
      this.categorie = data
    });
    value = {
      "description": value.description,
      "quantite":value.quantite,
      "prixUnitaire":value.price,
      "categorie": this.categorie
    }
    this.service.postData(value).subscribe(d =>{
      this.currentProduct =  d;
    return this.router.navigateByUrl("/new-product");
    });
  }

}
