package com.example.myapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.myapp.dao.UserDao;
import com.example.myapp.service.TestService;


@Service
public class TestServiceImpl implements TestService {

    public String number() {
        int[] a = new int[1];
        a[0] = (int) (Math.random() * 100);
        String str = "a[0]: "+ a[0];
        return str;
    }



}
