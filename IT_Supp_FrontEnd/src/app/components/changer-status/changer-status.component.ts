import {Component, OnInit} from '@angular/core';
import {Equipement} from "../../classes/equipement";
import {EquipementService} from "../../services/equipement.service";
import {ActivatedRoute, Router} from "@angular/router";
import {EtatEquipement} from "../../enums/EtatEquipement";

@Component({
  selector: 'app-changer-status',
  templateUrl: './changer-status.component.html',
  styleUrls: ['./changer-status.component.css']
})
export class ChangerStatusComponent implements OnInit{

  id!: number;
  equipement: Equipement = new Equipement();
  EtatEquipement = EtatEquipement;
  constructor(private equipementService: EquipementService,
              private route: ActivatedRoute,
              private router: Router) {
  }

  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];
    this.equipementService.equipementById(this.id).subscribe(
      data =>{
        this.equipement = data;
      }, error => console.log(error)
    );
  }

  onSubmit(){
    this.equipementService.changerStatu(this.id, this.equipement).subscribe(
      data => {
        console.log(data)
        this.router.navigate(['equipements'])
      }
    )
  }

}
