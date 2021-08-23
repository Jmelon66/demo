package com.springmvc.service;

import com.springmvc.bean.User;
import com.springmvc.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    public User selectUser(long Id) {
        return this.userDao.selectUser(Id);
    }

    @Override
    public User selectUserbyname(String userName) {
        return this.userDao.selectUserbyname(userName);
    }
}