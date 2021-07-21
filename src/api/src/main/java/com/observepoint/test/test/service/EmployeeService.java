package com.observepoint.test.test.service;

import com.observepoint.test.test.model.Employees;
import com.observepoint.test.test.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sabitha.vankireddy
 */
@Service
public class EmployeeService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employees> getAllEmployees()
    {
        List<Employees> employeesList = new ArrayList<Employees>();
        employeeRepository.findAll().forEach(employee -> employeesList.add(employee));
        return employeesList;
    }
    public Employees getEmployeeById(int id)
    {
        return employeeRepository.findById(id).get();
    }
    public void saveOrUpdate(Employees employees)
    {
        employeeRepository.save(employees);
    }
    public void delete(int id)
    {
        employeeRepository.deleteById(id);
    }

}
