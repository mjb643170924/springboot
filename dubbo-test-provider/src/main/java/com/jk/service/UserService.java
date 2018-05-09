package com.jk.service;

import com.alibaba.fastjson.JSONObject;

public interface UserService {

    public void sayHello(String username, String userpass);

    public String returnStr(Integer userid, String username);

}
