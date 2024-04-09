package com.example.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.myapp.model.User;
import java.util.List;


public interface UserDao extends JpaRepository<User,Integer>{

    List<User> findByName(String name);

    // @Query(value = "Select * from user u where name = :name and phone = :phone")
    // List<User> findABC(@Param("name") String name,@Param("phone") String phone);

    @Query("SELECT u FROM User u WHERE u.name = :name OR u.phone = :phone")
    List<User> findABC(@Param("name") String name, @Param("phone") String phone);
    

}
