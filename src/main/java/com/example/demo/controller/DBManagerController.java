package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DBManagerService;

@RestController
public class DBManagerController {
	
	@Autowired
	DBManagerService service;
	
	@RequestMapping("/")
	public String test() {
		return "OK";
	}
	
	@RequestMapping("/insertRole/{name}")
	public String inserRole(@PathVariable String name) {
		service.insertRole(name);
		return "insert OK";
	}
	
	@RequestMapping("/insertUser/{username}/{password}")
	public String insertUser(@PathVariable String username, @PathVariable String password) {
		service.insertUser(username, password);
		return "insert User OK";
	}
	
	@RequestMapping("/insertCategory/{name}")
	public String inserCategory(@PathVariable String name) {
		service.insertCategory(name);
		return "insert Category OK";
	}
}
