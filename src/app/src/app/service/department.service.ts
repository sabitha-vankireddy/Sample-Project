import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Department } from '../model/Department';

@Injectable({
  providedIn: 'root'
})
export class DepartmentService {

  private depUrl: string;

  constructor(private http: HttpClient) {
    this.depUrl = 'http://localhost:8080/getAllDepartments';
  }

  public findAll(): Observable<Department[]> {
    return this.http.get<Department[]>(this.depUrl);
  }

}
