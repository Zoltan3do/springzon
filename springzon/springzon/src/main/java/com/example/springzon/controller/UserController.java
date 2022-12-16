package com.example.springzon.controller;

import com.example.springzon.entity.Product;
import com.example.springzon.entity.User;
import com.example.springzon.service.ProductService;
import com.example.springzon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController //utilizzo un web service rest
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @PutMapping("/updateUser/{id_user}")
    public void updateUser(@RequestBody User user,@PathVariable Long id_user){
        userService.updateUser(id_user, user);
    }

    @DeleteMapping("/deleteUser/{id_user}")
    public void deleteUser(@PathVariable Long id_user){
        userService.deleteUser(id_user);
    }


}
