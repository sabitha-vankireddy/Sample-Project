package com.observepoint.test.test.repository;

import com.observepoint.test.test.model.Departments;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sabitha.vankireddy
 */
public interface DepartmentRepository extends CrudRepository<Departments, Integer>
{

}

