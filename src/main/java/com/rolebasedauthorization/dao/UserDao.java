package com.rolebasedauthorization.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rolebasedauthorization.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{

}
