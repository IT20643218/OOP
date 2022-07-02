package com.example.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "SumedhaLakmal";
    }

    @PostMapping("/saveUser")
    public String SaveUser(){
        return "Save SUmedha Lakmal";
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
