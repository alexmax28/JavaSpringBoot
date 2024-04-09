package com.example.myapp.controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.model.User;
import com.example.myapp.service.UserService;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserController {

    @Autowired UserService userService;

    @GetMapping("/allUser")
    public List<User> getAllUser() {
        List<User> res = userService.findAllUser();
        return res;
    }

    // @GetMapping("/filter")
    // public User getUser(@RequestParam int id) {
    //     User res = userService.findById(id).get();
    //     return res;
    // }

    @PostMapping("/user/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String createUser(@RequestBody User user) {

        userService.save(user);
        return "OK";
    }

    @PutMapping("/user/update/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody String entity) {
        userService.updateUser(id,entity);
        return null;
    }

    @GetMapping("/finda")
    public List<User> findA(@RequestParam String name ,@RequestParam(required = false) String phone){
        List<User> res = userService.findA(name,phone);
        return res;
    }
    
    
}
