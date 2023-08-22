import { TestBed } from '@angular/core/testing';
import { expect } from '@jest/globals';
import { TeacherService } from './teacher.service';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { Teacher } from '../interfaces/teacher.interface';

describe('TeacherService', () => {
  let teacherService: TeacherService;
  let mockHttpTestingController: HttpTestingController;
  let pathService = 'api/teacher';

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [
        HttpClientTestingModule
      ]
    });
    teacherService = TestBed.inject(TeacherService);
    mockHttpTestingController = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    mockHttpTestingController.verify();
  });

  it('test create component', () => {
    expect(teacherService).toBeTruthy();
  });

  describe('test get all teachers', () => {
    it('test get all teachers', () => {
      const mockTeachers: Teacher[] = [
        { id: 1, lastName: 'First teacher', firstName: '', createdAt: new Date(), updatedAt: new Date() },
        { id: 3, lastName: 'Second teacher', firstName: '', createdAt: new Date(), updatedAt: new Date() }
      ];
      teacherService.all().subscribe(teachers => {
        expect(teachers).toEqual(mockTeachers);
      });
      const req = mockHttpTestingController.expectOne(pathService);
      expect(req.request.method).toBe('GET');
      req.flush(mockTeachers);
    });
  });

  describe('test get teacher details by id', () => {
    it('test get teacher details by id', () => {
      const teacherId = '1';
      const mockTeacher: Teacher = { id: 1, lastName: 'Teacher 1', firstName: '', createdAt: new Date(), updatedAt: new Date() };
      teacherService.detail(teacherId).subscribe(session => {
        expect(session).toEqual(mockTeacher);
      });
      const req = mockHttpTestingController.expectOne(`${pathService}/${teacherId}`);
      expect(req.request.method).toBe('GET');
      req.flush(mockTeacher);
    });
  });

});
