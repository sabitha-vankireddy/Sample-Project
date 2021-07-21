package com.observepoint.test.test.controller;

import com.observepoint.test.test.model.Departments;
import com.observepoint.test.test.model.Employees;
import com.observepoint.test.test.repository.DepartmentRepository;
import com.observepoint.test.test.repository.EmployeeRepository;
import com.observepoint.test.test.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController
{
    @Autowired
    DepartmentService departmentService;

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/getAllDepartments")
    private List<Departments> getAllDepartments()
    {
        return (List<Departments>) departmentRepository.findAll();
    }

    @GetMapping("/departments/{departmentid}")
    private Departments getDepartment(@PathVariable("departmentid") int departmentid)
    {
        return departmentService.getDepartmentById(departmentid);
    }

    @DeleteMapping("/departments/{departmentid}")
    private void deleteDepartment(@PathVariable("departmentid") int departmentid)
    {
        departmentService.delete(departmentid);
    }

    @PostMapping("/departments")
    private int saveDepartments(@RequestBody Departments departments)
    {
        departmentService.saveOrUpdate(departments);
        return departments.getDepid();
    }

    @PutMapping("/departments")
    private Departments update(@RequestBody Departments departments)
    {
        departmentService.saveOrUpdate(departments);
        return departments;
    }
}
