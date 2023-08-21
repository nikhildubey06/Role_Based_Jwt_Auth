package com.rolebasedauthorization.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolebasedauthorization.entity.Role;
import com.rolebasedauthorization.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/createNewUser")
	public Role createNewRole(@RequestBody Role role) {
		return roleService.createNewRole(role); 
	}

}
