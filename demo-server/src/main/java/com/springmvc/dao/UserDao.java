package com.springmvc.dao;
import com.springmvc.bean.User;

public interface UserDao {
    //根据d查询用户
    User selectUser(long id);
    //根据name查询用户
    User selectUserbyname(String username);
}