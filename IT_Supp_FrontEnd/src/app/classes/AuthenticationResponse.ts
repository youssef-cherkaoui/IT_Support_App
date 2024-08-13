import {Personne} from "./personne";

export interface AuthenticationResponse{


  token : string;
  user : Personne;

}
