import {Component, OnInit} from '@angular/core';
import {Utilisateur} from "../classes/utilisateur";
import {TechUtiliService} from "../tech-utili.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-affiche-utilisateur',
  templateUrl: './affiche-utilisateur.component.html',
  styleUrls: ['./affiche-utilisateur.component.css']
})
export class AfficheUtilisateurComponent implements OnInit{

  utilisateurs!:Utilisateur[];

  constructor(
    private service: TechUtiliService,
    private router : Router
  ) {
  }

  ngOnInit(): void {
    this.getUtilisateur()
  }

  getUtilisateur(){
    this.service.getUtilisateur().subscribe(
      data =>{
        console.log(data)
        this.utilisateurs=data;
      }
    )
  }

}
