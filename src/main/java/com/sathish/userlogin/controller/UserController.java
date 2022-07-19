package com.sathish.userlogin.controller;

import com.sathish.userlogin.entity.User;
import com.sathish.userlogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/saveuser",method = RequestMethod.POST)
    public ResponseEntity<User> saveUser(@RequestBody User user){
      return new ResponseEntity<>(userService.saveUser(user),HttpStatus.OK);
    }
}
