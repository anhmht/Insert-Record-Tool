package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.User;

@Controller
public class UserController {
	@RequestMapping("/user")
	public String user(Map<String, Object> model,HttpServletRequest request) {
		request.setAttribute("user", "class='active'");
		return "user";
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userForm") User user, final RedirectAttributes redirectAttributes) {
		User user1 = new User();
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
		redirectAttributes.addFlashAttribute("css", "success");
		redirectAttributes.addFlashAttribute("msg", "User: " + user.getUsername() + "  added successfully!");
		return "redirect:/user";
	}

}
