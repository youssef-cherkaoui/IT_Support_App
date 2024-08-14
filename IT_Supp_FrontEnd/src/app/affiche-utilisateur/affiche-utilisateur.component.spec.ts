import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfficheUtilisateurComponent } from './affiche-utilisateur.component';

describe('AfficheUtilisateurComponent', () => {
  let component: AfficheUtilisateurComponent;
  let fixture: ComponentFixture<AfficheUtilisateurComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AfficheUtilisateurComponent]
    });
    fixture = TestBed.createComponent(AfficheUtilisateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
