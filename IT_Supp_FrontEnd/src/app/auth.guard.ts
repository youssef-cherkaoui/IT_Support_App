import { inject } from '@angular/core';
import { Router } from '@angular/router';
import { ActivatedRouteSnapshot, RouterStateSnapshot, CanActivateFn } from '@angular/router';
import { AuthService } from "./services/auth.service";
import { Role } from "./enums/Role";

export const authGuard: CanActivateFn = (
  route: ActivatedRouteSnapshot,
  state: RouterStateSnapshot
): boolean => {
  // const authService = inject(AuthService);
  // const router = inject(Router);
  //
  // const url: string = state.url;
  // const requiredRoles = route.data['roles'] as Role[] | undefined;
  // const token = localStorage.getItem("auth-token");
  // const role = localStorage.getItem("role") as Role | null;
  //
  // if (token) {
  //   if (requiredRoles && role && !requiredRoles.includes(role)) {
  //     // Si l'utilisateur n'a pas le rôle requis
  //     router.navigate(['/login']);
  //     return of(false);
  //   }
  //   // Si l'utilisateur est autorisé
  //   return of(true);
  // } else {
  //   // Si l'utilisateur n'est pas authentifié
  //   router.navigate(['/login'], { queryParams: { returnUrl: url } });
  //   return of(false);
  // }
    const token = localStorage.getItem('auth-guard');
  const router = inject(Router);
  console.log("quard")
  if(token){
    return true;
  }else{
    router.navigate(['home/login'])
    return false
  }
};
