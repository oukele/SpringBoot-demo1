package com.oukele.springboot.springboot_demo2.dao;

import com.oukele.springboot.springboot_demo2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserMapper extends JpaRepository<User,Integer> {

}
