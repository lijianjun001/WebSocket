package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String sendMsg(String name) {
        userService.addUser(UserEntity.builder().name(name).build());
        return "success";
    }
}
