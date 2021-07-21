package com.observepoint.test.test.controller;

import com.observepoint.test.test.model.Departments;
import com.observepoint.test.test.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController
{
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/getAllDepartments")
    private List<Departments> getAllDepartments()
    {
        return departmentService.getAllDepartments();
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
