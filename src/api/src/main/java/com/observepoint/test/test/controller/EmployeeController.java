package com.observepoint.test.test.controller;

import com.observepoint.test.test.model.Employees;
import com.observepoint.test.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAllEmployees")
    private List<Employees> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{employeeid}")
    private Employees getEmployees(@PathVariable("employeeid") int employeeid)
    {
        return employeeService.getEmployeeById(employeeid);
    }

    @DeleteMapping("/employee/{employeeid}")
    private void deleteEmployee(@PathVariable("employeeid") int employeeid)
    {
        employeeService.delete(employeeid);
    }

    @PostMapping("/employees")
    private int saveEmployee(@RequestBody Employees employees)
    {
        employeeService.saveOrUpdate(employees);
        return employees.getEmpid();
    }

    @PutMapping("/employees")
    private Employees update(@RequestBody Employees employees)
    {
        employeeService.saveOrUpdate(employees);
        return employees;
    }
}
