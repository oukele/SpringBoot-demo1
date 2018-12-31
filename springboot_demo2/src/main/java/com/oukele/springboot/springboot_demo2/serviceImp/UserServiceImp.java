package com.oukele.springboot.springboot_demo2.serviceImp;

import com.oukele.springboot.springboot_demo2.dao.UserMapper;
import com.oukele.springboot.springboot_demo2.entity.User;
import com.oukele.springboot.springboot_demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.findAll();
    }
}
