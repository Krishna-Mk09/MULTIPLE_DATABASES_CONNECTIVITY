//package com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryController;
//
//import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.primaryDomain.User;
//import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryDomain.Employee;
//import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.secondaryService.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
////@RequestMapping("/employee")
//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//
//    @PostMapping("/save")
//    public ResponseEntity<?> savesEmployee(@RequestBody Employee employee) {
//        return new ResponseEntity<>(this.employeeService.saveEmployee(employee), HttpStatus.OK);
//    }
//
//    @PostMapping("/save")
//    public ResponseEntity<?> savesEmployee(@RequestBody User user) {
//        return new ResponseEntity<>(this.employeeService.saveEmployee(user), HttpStatus.OK);
//    }
//
//
//}
