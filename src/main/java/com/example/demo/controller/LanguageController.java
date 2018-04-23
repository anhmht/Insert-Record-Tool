package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LanguageController {
	@RequestMapping("/language")
	public String language(Map<String, Object> model,HttpServletRequest request) {
		request.setAttribute("language", "class='active'");
		return "language";
	}
}
