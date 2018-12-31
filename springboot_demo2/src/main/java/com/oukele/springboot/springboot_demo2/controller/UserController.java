package com.oukele.springboot.springboot_demo2.controller;

import com.oukele.springboot.springboot_demo2.entity.User;
import com.oukele.springboot.springboot_demo2.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @RequestMapping(path = "list",method = RequestMethod.GET)
    public List<User> getList(){
        return userServiceImp.listAll();
    }

}
