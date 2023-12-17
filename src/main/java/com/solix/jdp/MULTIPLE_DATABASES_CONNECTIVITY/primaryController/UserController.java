package com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.primaryController;

import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.primaryDomain.User;
import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.primaryService.UserService;
import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryDomain.Employee;
import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;
    private final EmployeeService employeeService;

    @Autowired
    public UserController(UserService userService, EmployeeService employeeService) {
        this.userService = userService;
        this.employeeService = employeeService;
    }


    @PostMapping("/save")
    public ResponseEntity<?> savesUser(@RequestBody User user) {
      this.userService.saveUser(user);
        Employee employee = new Employee();
        employee.setName(user.getName());
        employee.setName(user.getName());
        employee.setEmail(user.getEmail());
        this.employeeService.saveEmployee(employee);
        return new ResponseEntity<>("data saved successfully",HttpStatus.CREATED);

    }

}
