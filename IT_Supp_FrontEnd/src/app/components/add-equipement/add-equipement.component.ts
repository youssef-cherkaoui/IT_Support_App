import {Component, OnInit} from '@angular/core';
import {Equipement} from "../../classes/equipement";
import {EquipementService} from "../../services/equipement.service";
import {Router} from "@angular/router";
import {EtatEquipement} from "../../enums/EtatEquipement";


@Component({
  selector: 'app-add-equipement',
  templateUrl: './add-equipement.component.html',
  styleUrls: ['./add-equipement.component.css']
})
export class AddEquipementComponent implements OnInit{

  etats = Object.values(EtatEquipement);



  equipement: Equipement = new Equipement();


  constructor(private equipementService : EquipementService,
              private router : Router) {
  }

  ngOnInit(): void {
  }

  addEquipement(){
    this.equipementService.addEquipement(this.equipement).subscribe(
      data => {
        console.log(data)
        this.router.navigate(['equipements'])
      }
    )
  }

  onSubmit(){
    this.equipement.etatEquipement= EtatEquipement.Fonctionnel
    console.log(this.equipement)
    this.addEquipement()
  }

}
