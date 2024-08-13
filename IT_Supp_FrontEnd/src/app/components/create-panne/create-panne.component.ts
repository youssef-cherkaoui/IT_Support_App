import {Component, OnInit} from '@angular/core';
import {Panne} from "../../classes/panne";
import {PanneService} from "../../services/panne.service";
import {Router} from "@angular/router";
import {error} from "@angular/compiler-cli/src/transformers/util";

@Component({
  selector: 'app-create-panne',
  templateUrl: './create-panne.component.html',
  styleUrls: ['./create-panne.component.css']
})
export class CreatePanneComponent implements OnInit{

  panne = new Panne();

  constructor(private panneService:PanneService,
              private router : Router) {
  }
  ngOnInit(): void {
  }

  onSubmit(){
    this.panneService.createPanne(this.panne).subscribe(
      data =>{
        console.log(data)
      },error => console.log(error)
    )
    this.router.navigate(['home/pannes'])
  }

}
