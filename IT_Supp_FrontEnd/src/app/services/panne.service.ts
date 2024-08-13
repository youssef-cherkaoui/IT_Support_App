import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Panne} from "../classes/panne";
import {Equipement} from "../classes/equipement";

@Injectable({
  providedIn: 'root'
})
export class PanneService {

  private baseUrl = "http://localhost:8091/api/v1/auth/Admin/"


  constructor(private httpClient: HttpClient) { }

  getPannes():Observable<Panne[]>{
    const headers = this.createAuthorizationHeader();
    return this.httpClient.get<Panne[]>(this.baseUrl+'ShowAllPanne',{ headers: headers || {} })
  }

  panneById(id: number): Observable<Panne>{
    const headers = this.createAuthorizationHeader();
    return this.httpClient.get<Panne>(`${this.baseUrl}${id}`,{ headers: headers || {} })
  }

  updatePanne(id: number, panne: Panne):Observable<Object>{
    const headers = this.createAuthorizationHeader();

    return this.httpClient.put<Equipement>(`${this.baseUrl}editPanne/${id}`,panne,{ headers: headers || {} })
  }

  createPanne(panne:Panne):Observable<Object>{
    const headers = this.createAuthorizationHeader();

    return this.httpClient.post(this.baseUrl+'CreatePanne',panne,{ headers: headers || {} })
  }

  deletePanne(idPanne:number): Observable<Object>{
    const headers = this.createAuthorizationHeader();

    console.log(idPanne)
    return this.httpClient.delete(`${this.baseUrl}${idPanne}`,{ headers: headers || {} })
  }

  private createAuthorizationHeader(): HttpHeaders | undefined {
    const jwtToken = localStorage.getItem('auth-token');
    if (jwtToken) {
      console.log("JWT token found in local storage", jwtToken);
      return new HttpHeaders().set("Authorization", "Bearer " + jwtToken);
    } else {
      console.log("JWT token not found in local storage");
      return undefined;
    }
  }
}
