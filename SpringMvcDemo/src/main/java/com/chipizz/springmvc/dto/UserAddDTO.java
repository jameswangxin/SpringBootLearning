package com.chipizz.springmvc.dto;

/*
* 用户添加DTO
* */

public class UserAddDTO {
    private String username; //账号
    private String password; //密码

    public  String getUsername() {
        return this.username;
    }

    public UserAddDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public UserAddDTO setPassword(String password) {
        this.password = password;
        return this;
    }
}
