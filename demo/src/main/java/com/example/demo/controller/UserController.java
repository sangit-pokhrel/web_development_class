package com.example.demo.controller;

import com.example.demo.pojo.UserPojo;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @PostMapping
    public void save(@RequestBody UserPojo userPojo){
        this.userService.saveInfo(userPojo);
    }


}
