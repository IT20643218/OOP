package com.example.TestDemo.controller;

import com.example.TestDemo.dto.Userdto;
import com.example.TestDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    //Get method
    @GetMapping("/getUsers")
    public List<Userdto> getUser(){
        return userService.getAllUsers();
    }

    //Post Request
    @PostMapping("/saveUser")
    public Userdto SaveUser(@RequestBody Userdto userdto){
        return userService.SaveUser(userdto);
    }

    @PutMapping("/Updateuser")
    public String updateUser(){
        return "Update User";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "Delete User";
    }
}
