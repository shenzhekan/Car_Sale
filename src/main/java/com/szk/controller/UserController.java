package com.szk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szk.dao.IUserDao;
import com.szk.dao.impl.UserDaoImpl;
import com.szk.service.IUserService;
import com.szk.vo.User;

@Controller
//@RequestMapping("/user")
public class UserController {

	private IUserService userService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model) {
		//String userId = request.getParameter("User_Id");
		//String password = request.getParameter("Password");
		
		User user = this.userService.login("root", "root");
		if(user.getUserName() != null) {
			model.addAttribute("userName", user.getUserName());
			return "main";
		}
		return "login";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request,Model model) {
		return "login";
	}
	
}
