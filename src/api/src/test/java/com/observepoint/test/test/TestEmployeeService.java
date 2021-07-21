package com.observepoint.test.test;

import com.observepoint.test.test.model.Employees;
import com.observepoint.test.test.repository.EmployeeRepository;
import com.observepoint.test.test.service.EmployeeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * @author sabitha.vankireddy
 */
public class TestEmployeeService {
    private EmployeeService employeeService;

    private EmployeeRepository mockEmployeeRepository;
    private Employees employees = new Employees();


    @Before
    public void setup() {
        mockEmployeeRepository = mock(EmployeeRepository.class);
        employeeService = new EmployeeService(mockEmployeeRepository);

        employees.setEmpid(12);
        employees.setEmpage(23);
        employees.setEmpname("Dan");

    }

    @Test
    public void testSaveEmployee() {
        when(mockEmployeeRepository.save(employees)).thenReturn(employees);

        try {
            employeeService.saveOrUpdate(employees);
        } catch (Exception e) {
            Assert.fail();
        }
        verify(mockEmployeeRepository).save(employees);
    }

    @Test
    public void testGetEmployeeById() {
        when(mockEmployeeRepository.findById(12)).thenReturn(Optional.of(employees));
        Employees result = employeeService.getEmployeeById(12);

        assertNotNull("EmployeeList must not be null.", result);
        assertEquals("EmployeeID must be the same", 12, result.getEmpid());
        verify(mockEmployeeRepository).findById(12);
    }


    @Test
    public void testReadEmployeeList() {
        List<Employees> employeeList = new ArrayList<>();
        employeeList.add(employees);
        when(mockEmployeeRepository.save(employees)).thenReturn(employees);
        when(mockEmployeeRepository.findAll()).thenReturn(employeeList);
        try {
            employeeService.saveOrUpdate(employees);
        } catch (Exception e) {
            Assert.fail();
        }
        List<Employees> result = employeeService.getAllEmployees();
        assertNotNull("EmployeeList must not be null.", result);
        assertEquals("EmployeeID must be the same", 12, result.get(0).getEmpid());
        verify(mockEmployeeRepository).save(employees);
        verify(mockEmployeeRepository).findAll();
    }

}
