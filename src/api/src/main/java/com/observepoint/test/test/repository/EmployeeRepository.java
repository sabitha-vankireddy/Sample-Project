package com.observepoint.test.test.repository;
import com.observepoint.test.test.model.Employees;
import org.springframework.data.repository.CrudRepository;


/**
 * @author sabitha.vankireddy
 */
 public interface EmployeeRepository extends CrudRepository<Employees, Integer>
{

}
