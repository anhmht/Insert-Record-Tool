package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomePageController {
	@RequestMapping("/")
	public String user(Map<String, Object> model, HttpServletRequest request) {
		request.setAttribute("welcome", "class='active'");
		return "welcome";
	}
}
