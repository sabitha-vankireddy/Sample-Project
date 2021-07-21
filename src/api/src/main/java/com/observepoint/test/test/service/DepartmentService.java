package com.observepoint.test.test.service;

import com.observepoint.test.test.model.Departments;
import com.observepoint.test.test.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sabitha.vankireddy
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Departments> getAllDepartments()
    {
        List<Departments> departmentsList = new ArrayList<Departments>();
        departmentRepository.findAll().forEach(dep -> departmentsList.add(dep));
        return departmentsList;
    }
    public Departments getDepartmentById(int id)
    {
        return departmentRepository.findById(id).get();
    }
    public void saveOrUpdate(Departments departments)
    {
        departmentRepository.save(departments);
    }
    public void delete(int id)
    {
        departmentRepository.deleteById(id);
    }

}
