import {Component, OnInit} from '@angular/core';
import {Panne} from "../../classes/panne";
import {PanneService} from "../../services/panne.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-update-panne',
  templateUrl: './update-panne.component.html',
  styleUrls: ['./update-panne.component.css']
})
export class UpdatePanneComponent implements OnInit{

  id!:number;
  panne: Panne = new Panne();
  constructor(private panneService : PanneService,
              private router : Router,
              private route: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.panneService.panneById(this.id).subscribe(
      data =>{
        this.panne = data;
      },error => console.log(error)
    );
  }
  onSubmit(){
    this.panneService.updatePanne(this.id, this.panne).subscribe(
      data =>{
        console.log(data)
        this.router.navigate(['home/pannes'])
      }
    )
  }

}
