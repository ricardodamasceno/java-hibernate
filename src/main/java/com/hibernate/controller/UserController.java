package com.hibernate.controller;

import com.hibernate.entity.User;
import com.hibernate.service.UserService;
import com.hibernate.vo.request.UserRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("rest/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{name}/findByName")
    public User findByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @GetMapping("/{id}/findById")
    public User findByName(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody @Valid UserRequestVO request){
        return userService.saveUser(request);
    }

}
