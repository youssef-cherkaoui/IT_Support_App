import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Equipement} from "../classes/equipement";

@Injectable({
  providedIn: 'root'
})
export class EquipementService {

  private baseUrl = "http://localhost:8091/api/v1/auth/Admin/";



  constructor(private httpClient : HttpClient) { }

  getEquipements(): Observable<Equipement[]>{
    const headers = this.createAuthorizationHeader();
    return this.httpClient.get<Equipement[]>(this.baseUrl+"ShowAll",{ headers: headers || {} });
  }

  addEquipement(equipement: Equipement): Observable<Object>{
    const headers = this.createAuthorizationHeader();
      return this.httpClient.post(this.baseUrl+"CreateEquipement", equipement, { headers: headers || {} })
    }

  equipementById(id: number): Observable<Equipement>{
    return this.httpClient.get<Equipement>(`${this.baseUrl}${id}`)
    }

  updateEquipement(id: number, equipement: Equipement): Observable<Object>{
    const headers = this.createAuthorizationHeader();
    return this.httpClient.put<Equipement>(`${this.baseUrl}equipPut/${id}`,equipement,{ headers: headers || {} })
  }

  deleteEquipement(id: Number):Observable<Object>{
    const headers = this.createAuthorizationHeader();
    return this.httpClient.delete<Equipement>(`${this.baseUrl}delete/${id}`,{ headers: headers || {} })
  }

  changerStatu(id: number, equipement: Equipement): Observable<Object>{
    const headers = this.createAuthorizationHeader();
    return this.httpClient.put<Equipement>(`${this.baseUrl}statut/${id}`,equipement  )
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
