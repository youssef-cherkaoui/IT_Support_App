import {Role} from "../enums/Role";

export class Technicien {

  id!: number;      // Correspond à Long en Java
  nom!: string;
  email!: string;
  motdepasse!: string;
  role!: Role;

}
