import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AppComponent} from "./app.component";
import {AddEquipementComponent} from "./components/add-equipement/add-equipement.component";
import {EquipementComponent} from "./components/equipement/equipement.component";
import {UpdateEquipementComponent} from "./components/update-equipement/update-equipement.component";
import {PanneComponent} from "./components/panne/panne.component";
import {ChangerStatusComponent} from "./components/changer-status/changer-status.component";
import {UpdatePanneComponent} from "./components/update-panne/update-panne.component";
import {CreatePanneComponent} from "./components/create-panne/create-panne.component";
import {authGuard} from "./auth.guard";
import {Role} from "./enums/Role";
import {LoginComponent} from "./login/login.component";
import {HomeComponent} from "./home/home.component";
import {InfoComponent} from "./info/info.component";


const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent,
    children: [
      {path: '', component: InfoComponent},
      { path: 'login', component: LoginComponent},
      { path: 'pannes', component: PanneComponent,canActivate:[authGuard]},
      { path: 'pannes/create', component: CreatePanneComponent,canActivate:[authGuard]},
      { path: 'equipements', component: EquipementComponent, canActivate:[authGuard]},
     { path: 'equipements/addEquipement', component: AddEquipementComponent,canActivate:[authGuard]}
    ]
  },



  { path: 'updateEquipement/:id', component: UpdateEquipementComponent },
  { path: 'addPanne', component: CreatePanneComponent },
  { path: 'etatEquipement/:id', component: ChangerStatusComponent },
  { path: 'updatePanne/:id', component: UpdatePanneComponent },


  { path: 'equipements', redirectTo: '/home/equipements', pathMatch: 'full' },


  { path: '', redirectTo: '/home', pathMatch: 'full' },

  { path: '**', redirectTo: '/home' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
