import { TestBed } from '@angular/core/testing';

import { TechUtiliService } from './tech-utili.service';

describe('TechUtiliService', () => {
  let service: TechUtiliService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TechUtiliService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
