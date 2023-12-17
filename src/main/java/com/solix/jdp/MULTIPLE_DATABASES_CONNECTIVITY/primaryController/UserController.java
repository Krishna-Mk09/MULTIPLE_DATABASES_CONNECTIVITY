package com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.primaryController;

import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.primaryDomain.User;
import com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.primaryService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/save")
    public ResponseEntity<?> savesUser(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.saveUser(user), HttpStatus.OK);
    }


}
