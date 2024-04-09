package com.example.myapp.service;
import java.util.List;
import com.example.myapp.model.User;

public interface UserService {


    public List<User> findAllUser();
    
    public void save(User user);
    
    public void updateUser(Integer id, String entity);

    public List<User> findA(String name, String phone);

}
