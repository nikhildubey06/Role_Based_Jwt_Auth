package com.rolebasedauthorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rolebasedauthorization.dao.RoleDao;
import com.rolebasedauthorization.entity.Role;

@Service
public class RoleService {

	@Autowired
	private RoleDao roleDao;
	
	public Role createNewRole(Role role) {
		return roleDao.save(role);
	}
}
