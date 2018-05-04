package com.szk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szk.service.IUserService;
import com.szk.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {

	private IUserService userService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model) {
		String userId = request.getParameter("user.User_Id");
		String password = request.getParameter("user.Password");
		
		User user = this.userService.getUserByIdName(new User(userId,password));
		if(user.getUserName() != null) {
			model.addAttribute("userName", user.getUserName());
			return "main";
		}
		return "login";
		
	}
	
}
