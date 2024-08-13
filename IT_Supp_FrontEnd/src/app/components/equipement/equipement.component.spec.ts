import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EquipementComponent } from './equipement.component';

describe('EquipementComponent', () => {
  let component: EquipementComponent;
  let fixture: ComponentFixture<EquipementComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EquipementComponent]
    });
    fixture = TestBed.createComponent(EquipementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
