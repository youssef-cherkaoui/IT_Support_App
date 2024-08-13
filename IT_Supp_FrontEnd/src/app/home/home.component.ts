import { Component } from '@angular/core';
import {AuthService} from "../services/auth.service";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  constructor(private authService: AuthService) {
  }

  onLogout(): void{
    this.authService.logout();
  }

  isLoggedIn(): boolean {
    return !!localStorage.getItem('auth-token');
  }
}
