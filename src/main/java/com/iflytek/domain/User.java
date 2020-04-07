package com.iflytek.domain;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String realName;
    private String phone;
    private String address;
}
