package com.rolebasedauthorization.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolebasedauthorization.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String>{

}
