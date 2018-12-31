package com.oukele.springboot.springboot_demo2.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")//数据库的表名
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长主键
    private int id;

    @Column(name = "username")//数据库的字段名，数据库 不区分大小写 这个 要注意
    private String name;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
