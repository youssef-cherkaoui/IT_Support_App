import {Component, OnInit} from '@angular/core';
import {Utilisateur} from "../classes/utilisateur";
import {Role} from "../enums/Role";
import {TechUtiliService} from "../tech-utili.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-ajouter-utilisateur',
  templateUrl: './ajouter-utilisateur.component.html',
  styleUrls: ['./ajouter-utilisateur.component.css']
})
export class AjouterUtilisateurComponent implements OnInit{

  utilisateur : Utilisateur = new Utilisateur();


  constructor(private service:TechUtiliService,
              private router : Router) {
  }

  ngOnInit(): void {
  }

  addUtilisateur(){
    this.service.addUtilisateur(this.utilisateur).subscribe(
      data =>{
        console.log(data);
      }
    )
  }

  onSubmit(){
    this.addUtilisateur();
    this.router.navigate(['home/utilisateurs'])
  }

}
