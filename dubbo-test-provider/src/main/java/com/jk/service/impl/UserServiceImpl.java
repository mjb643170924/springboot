package com.jk.service.impl;

import com.jk.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String username, String userpass) {
        System.out.println("姓名"+username+",密码"+userpass);
    }

    @Override
    public String returnStr(Integer userid, String username) {
        return "Id"+userid+",姓名"+username;
    }
}
