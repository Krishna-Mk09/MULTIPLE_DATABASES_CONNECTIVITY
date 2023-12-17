package com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryRepository;

import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryDomain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    public Employee findByName(String name);

}
