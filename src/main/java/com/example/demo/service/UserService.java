package com.example.demo.service;


import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void addUser(UserEntity user){

        System.out.println("增加Success");
    }
}
