import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Utilisateur} from "./classes/utilisateur";
import {Technicien} from "./classes/technicien";

@Injectable({
  providedIn: 'root'
})
export class TechUtiliService {

  private Url = "http://localhost:8091/api/v1/auth/Admin/"
  private url = "http://localhost:8091/api/v1/auth/"


  constructor(
    private httpClient: HttpClient
  ) {
  }

  getUtilisateur():Observable<Utilisateur[]> {
    const headers = this.createAuthorizationHeader();
    return this.httpClient.get<Utilisateur[]>(this.Url + 'utilisateurs', {headers: headers || {}})
  }

  addUtilisateur(utilisateur:Utilisateur):Observable<Object>{
    const headers = this.createAuthorizationHeader();
    return this.httpClient.post(this.url+'Admin/register',utilisateur, {headers: headers || {}})


  }

  getTechnicien(): Observable<Technicien[]> {

    const headers = this.createAuthorizationHeader();
    return this.httpClient.get<Technicien[]>(this.Url + "techniciens", {headers: headers || {}})
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
