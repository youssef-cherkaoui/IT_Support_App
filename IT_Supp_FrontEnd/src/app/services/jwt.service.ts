import { Injectable } from '@angular/core';
import * as jwt_decode from 'jwt-decode';
import {Role} from "../enums/Role";
import {Personne} from "../classes/personne";
import {AuthenticationRequest} from "../classes/AuthenticationRequest";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";


@Injectable({
  providedIn: 'root'
})
export class JwtService {

  private url="http://localhost:8091/api/v1/auth/"

  constructor(private http: HttpClient) {
  }

  extractUsername(token: string): string {
    return this.extractClaim<string>(token, 'sub');
  }

  // extractRole(token: string): Role {
  //   return this.extractClaim<Role>(token, 'role');
  // }
  //
  // extractUser(token: string): Personne {
  //   return this.extractClaim<Personne>(token, 'user');
  // }

  extractExpiration(token: string): Date {
    const expiration = this.extractClaim<number>(token, 'exp');
    return new Date(expiration * 1000);
  }

  private extractClaim<T>(token: string, claim: string): T {
    const decodedToken = jwt_decode.jwtDecode<any>(token);
    return decodedToken[claim];
  }

  isTokenExpired(token: string): boolean {
    const expiration = this.extractExpiration(token);
    return expiration < new Date();
  }

  validateToken(token: string, userDetails: AuthenticationRequest): boolean {
    const username = this.extractUsername(token);
    return username === userDetails.email && !this.isTokenExpired(token);
  }

  login(loginRequest: any): Observable<any>{
    return this.http.post<any>(this.url + 'authenticate', loginRequest)
  }
}
