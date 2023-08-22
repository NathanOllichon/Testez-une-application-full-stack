import { TestBed } from '@angular/core/testing';
import { expect } from '@jest/globals';
import { SessionService } from './session.service';
import { SessionInformation } from '../interfaces/sessionInformation.interface';
import { Observable } from 'rxjs';

describe('SessionService', () => {
  const mockSessionInformation: SessionInformation = { token: '', type: '', id: 10, username: '', firstName: '', lastName: '', admin: true };
  let sessionService: SessionService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    sessionService = TestBed.inject(SessionService);
  });

  describe('test create component', () => {
    it('test be created', () => {
      expect(sessionService).toBeTruthy();
    });

    it('test creation, isLogged at false', () => {
      expect(sessionService.isLogged).toBeFalsy();
    });

    it('test creation, sessionInformation at undefined', () => {
      expect(sessionService.sessionInformation).toBeUndefined();
    });
  });

  describe('test observable $isLogged', () => {
    it('test, return one observable of $isLogged()', () => {
      expect(sessionService.$isLogged()).toBeInstanceOf(Observable);
    });
  });

  describe('test session logIn', () => {
    it('should set sessionInformation and set isLogger to true on logIn', () => {
      sessionService.logIn(mockSessionInformation);
      expect(sessionService.isLogged).toBeTruthy();
      expect(sessionService.sessionInformation).toEqual(mockSessionInformation);
    });
  });

  describe('test session logOut', () => {
    it('test set sessionInformation to undefined and set isLogger to false on logOut', () => {
      sessionService.logOut();
      expect(sessionService.isLogged).toBeFalsy();
      expect(sessionService.sessionInformation).toBeUndefined();
    });
  });

});
