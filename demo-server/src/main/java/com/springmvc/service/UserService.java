package com.springmvc.service;
import com.springmvc.bean.User;
public interface UserService {
    public User selectUser(long userId);
    public User selectUserbyname(String userName);
}