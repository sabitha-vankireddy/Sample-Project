import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../service/employee.service';
import { Employee } from '../model/Employee';
import { Department } from '../model/Department';
import { DepartmentService } from '../service/department.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  public employees: Employee[] | undefined;
  public departments: Department[] | undefined;

  constructor(public empService: EmployeeService,
              public depService: DepartmentService) { }

  ngOnInit(): void {
    this.empService.findAll().subscribe(data => {
      this.employees = data;
    });

    this.depService.findAll().subscribe(data => {
      this.departments = data;
    });
  }
}

