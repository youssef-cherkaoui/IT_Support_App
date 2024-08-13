import {Component, OnInit} from '@angular/core';
import {Equipement} from "../../classes/equipement";
import {EquipementService} from "../../services/equipement.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-equipement',
  templateUrl: './equipement.component.html',
  styleUrls: ['./equipement.component.css']
})
export class EquipementComponent implements OnInit{

  equipements!: Equipement[];

  constructor(private equipmentService: EquipementService,
              private router: Router) {
  }

  ngOnInit(): void {

    this.getEquipments()
  }

  private getEquipments(){
    this.equipmentService.getEquipements().subscribe(
      data => {
        console.log(data)
        this.equipements = data
      }
    )
  }

  updateEquipement(id: Number){
    this.router.navigate(['updateEquipement', id])
  }

  changerEquipement(id: Number){
    this.router.navigate(['etatEquipement', id])
  }

  deleteEquipement(id: Number){
    this.equipmentService.deleteEquipement(id).subscribe(
      data =>{
        console.log(data)
        this.getEquipments()
      }
    )
  }

  addEquipement(): void {
    this.router.navigate(['/addEquipement']);
  }

}
