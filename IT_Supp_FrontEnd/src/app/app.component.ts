import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'IT_Support';
  show : boolean = false;

  constructor(
    private router:Router,
    private http:HttpClient
  ) {
  }

  protected checkpath() {
    const url = this.router.url;
    this.show = url.includes('admin/');
  }

  ngOnInit(): void {
    this.checkpath()
  }
}
