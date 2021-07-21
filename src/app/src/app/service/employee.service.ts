import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../model/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private empUrl: string;

  constructor(private http: HttpClient) {
    this.empUrl = 'http://localhost:8080/getAllEmployees';
  }

  public findAll(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.empUrl);
  }

}
