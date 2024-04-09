package com.example.myapp.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dao.UserDao;
import com.example.myapp.model.User;
import com.example.myapp.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired UserDao userDao;

    @Override
    public void updateUser(Integer id, String entity) {
        User user = userDao.findById(id).get();
        user.setName(entity);
        userDao.save(user);
    }

    @Override
    public List<User> findAllUser() {
        List<User> res = userDao.findAll();
        return res;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findA(String name,String phone) {
        List<User> res = userDao.findABC(name, phone);
        return res;
    }

    

}
