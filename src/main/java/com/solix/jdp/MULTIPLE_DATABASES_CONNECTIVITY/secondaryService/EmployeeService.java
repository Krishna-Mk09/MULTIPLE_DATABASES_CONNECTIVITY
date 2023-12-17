package com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryService;

import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryDomain.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    Employee getEmployeeByName(String name);
}
