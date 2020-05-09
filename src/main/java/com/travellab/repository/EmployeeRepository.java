package com.travellab.repository;

import com.travellab.RestConstants;
import com.travellab.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}