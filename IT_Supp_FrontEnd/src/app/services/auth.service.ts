import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {JwtService} from "./jwt.service";
import {map, Observable, throwError} from "rxjs";
import {AuthenticationRequest} from "../classes/AuthenticationRequest";
import {AuthenticationResponse} from "../classes/AuthenticationResponse";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private apiUrl =`http://localhost:8091/api/v1/auth/`

  constructor(

    private http: HttpClient,
    private jwtService : JwtService,
    private router : Router,


  ) { }

  login(loginRequest: AuthenticationRequest): Observable<AuthenticationResponse | null> {
    return this.http.post<AuthenticationResponse>(`${this.apiUrl}authenticate`, loginRequest).pipe(
      map(response => {
        console.log(response)
        const authResponse: AuthenticationResponse = response;
        if (authResponse.token && this.jwtService.validateToken(authResponse.token, loginRequest)) {
          console.log(authResponse.user)
          localStorage.setItem("auth-token", authResponse.token);
          localStorage.setItem("id", authResponse.user.id.toString())
          localStorage.setItem("role", authResponse.user.role)
          return authResponse;
        }
        // Si le token est invalide ou absent, retourner null ou une autre valeur appropriée
        return null;
      }),
    );
  }
  getToken(): string | null {
    return localStorage.getItem('auth-token');
  }

  logout(): void{
    localStorage.removeItem('auth-token');
    localStorage.removeItem('id');
    localStorage.removeItem('role');

    this.router.navigate(['/login'])
  }

  isLoggedIn(): boolean {
    return !!localStorage.getItem('auth-token');
  }

}
