import {Role} from "../enums/Role";

export interface Personne {

  id: number;      // Correspond à Long en Java
  nom: string;
  email: string;
  motdepasse: string;
  role: Role;
}
