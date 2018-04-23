package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;

@Service
public class DBManagerService {
	@Autowired
	UserRepository user;
	
	@Autowired
	CategoryRepository category;
	
	@Autowired
	ProductRepository product;
	
	@Autowired
	RoleRepository role;
	
	public void insertUser(String username, String pass) {
		User user1 = new User();
		
		Role role1 = role.getRole("member");
		
		user1.setUsername(username);
		user1.setPassword(pass);
		user1.setRole(role1);
		
		user.save(user1);
		
	}
	
	public void insertRole(String name) {
		Role role1 = new Role();
		role1.setRole_name(name);
		role.save(role1);
	}
	
	public void insertCategory(String name) {
		Category cate = new Category();
		category.save(cate);
	}
}
