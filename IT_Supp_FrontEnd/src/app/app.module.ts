import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EquipementComponent } from './components/equipement/equipement.component';
import { PanneComponent } from './components/panne/panne.component';
import { AddEquipementComponent } from './components/add-equipement/add-equipement.component';
import { ChangerStatusComponent } from './components/changer-status/changer-status.component';
import { CreatePanneComponent } from './components/create-panne/create-panne.component';
import { UpdateEquipementComponent } from './components/update-equipement/update-equipement.component';
import { UpdatePanneComponent } from './components/update-panne/update-panne.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { InfoComponent } from './info/info.component';

@NgModule({
  declarations: [
    AppComponent,
    EquipementComponent,
    PanneComponent,
    AddEquipementComponent,
    ChangerStatusComponent,
    CreatePanneComponent,
    UpdateEquipementComponent,
    UpdatePanneComponent,
    LoginComponent,
    HomeComponent,
    InfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
