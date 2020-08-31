package com.chipizz.springmvc.dto;

public class UserUpdateDTO {
    private Integer id; //编号
    private String username; //账号
    private String password; //密码

    public Integer getId() {
        return this.id;
    }

    public UserUpdateDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public UserUpdateDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public UserUpdateDTO setPassword(String password) {
        this.password = password;
        return this;
    }
}
