import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";

import {Produit} from "../model/product.model";
import {Observable} from "rxjs";
import {Categorie} from "../model/Categorie.model";

@Injectable({
  providedIn: 'root'
})
export class CatalogueService {

  public host: string = "http://localhost:8080/";

  constructor(private httpClient: HttpClient) {
  }

  public getProducts(page: number, size: number):Observable<Produit> {
    return this.httpClient.get<Produit>(this.host + "products?page=" + page + "&size=" + size);
  }

  public deleteResource(url) {
    return this.httpClient.delete(url);
  }
  public doSearchByKeyWord(keyword: string, page: number, size: number) : Observable<Produit> {
    return this.httpClient.get<Produit>(this.host + "produits/search/designation?desc=" + keyword + "&page=" + page + "&size=" + size);
  }

  public findAllByCategory(id: number, page: number, size: number) : Observable<Produit>{
    return this.httpClient.get<Produit>(this.host + "products/search/byCategories?c=" + id + "&page=" + page + "&size=" + size);
  }

  public findAllCategory() :Observable<Categorie>{
    return this.httpClient.get<Categorie>(this.host + "categories");
  }
  public findCategory(id:number) :Observable<Categorie>{
    return this.httpClient.get<Categorie>(this.host + "categories/"+id);
  }

  public postData(value)  {
    return this.httpClient.post(this.host+"produits",value);
  }

  public getCategoryOfProduct(url:string) :Observable<Categorie>{
    return this.httpClient.get<Categorie>(url);
  }

  public editProduct(url,value) {
    return this.httpClient.put(url, value);
  }
  public findProduct(url:string) : Observable<Produit>{
    return this.httpClient.get<Produit>(url);
  }


}
