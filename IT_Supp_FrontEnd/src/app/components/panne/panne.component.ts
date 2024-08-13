import {Component, OnInit} from '@angular/core';
import {Panne} from "../../classes/panne";
import {PanneService} from "../../services/panne.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-panne',
  templateUrl: './panne.component.html',
  styleUrls: ['./panne.component.css']
})
export class PanneComponent implements OnInit{

  panneList!:Panne[];

  id!: number;

  constructor(private panneService : PanneService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.getPannes()
  }

  getPannes(){
    this.panneService.getPannes().subscribe(
      data =>{
        console.log(data)
        this.panneList = data
      }
    )
  }

  updatePanne(id: Number){
    this.router.navigate(['updatePanne', id])
  }

  deletePanne(id:number){
    console.log(id)
    this.panneService.deletePanne(id).subscribe(
      data =>{
        console.log(data)
        this.getPannes()
      }
    )
  }

}
