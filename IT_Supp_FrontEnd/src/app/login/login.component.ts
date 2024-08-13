import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {AuthenticationRequest} from "../classes/AuthenticationRequest";
import {AuthService} from "../services/auth.service";
import {AuthenticationResponse} from "../classes/AuthenticationResponse";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginRequest: FormGroup;

  errorMessage: string | null = null;

  constructor(private authService: AuthService, private router: Router, private fb: FormBuilder) {
    this.loginRequest = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      motdepasse: ['', Validators.required]
    });
  }

  ngOnInit(): void {
  }

  onSubmit(): void {

    if (this.loginRequest.valid){

      const login : AuthenticationRequest = this.loginRequest.value

      this.authService.login(login).subscribe({
        next: (response: AuthenticationResponse | null) => {
          if (response) {
            // Rediriger vers la page d'accueil ou une autre page après le login
            this.router.navigate(['/home']);
          } else {
            this.errorMessage = "Invalid login credentials. Please try again.";
          }
        },
        error: err => {
          this.errorMessage = "An error occurred during login. Please try again later.";
          console.error(err);
        }
      });
    }
    }


}
