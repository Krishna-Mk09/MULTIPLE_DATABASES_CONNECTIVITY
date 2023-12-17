package com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryService;

import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryDomain.Employee;
import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryRepository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return this.employeeRepository.findByName(name);
    }
}
