import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangerStatusComponent } from './changer-status.component';

describe('ChangerStatusComponent', () => {
  let component: ChangerStatusComponent;
  let fixture: ComponentFixture<ChangerStatusComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChangerStatusComponent]
    });
    fixture = TestBed.createComponent(ChangerStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
