package com.second.shop.dao;

import com.second.shop.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailId(@Param("email") String email);
}
