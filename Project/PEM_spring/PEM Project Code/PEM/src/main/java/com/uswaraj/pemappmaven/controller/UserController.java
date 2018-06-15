/**
 * 
 */
package com.uswaraj.pemappmaven.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uswaraj.pemappmaven.domain.User;
import com.uswaraj.pemappmaven.service.UserService;

/**
 * @author udakhe.swaraj
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	HttpSession session;
	
	User user;

	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	public ModelAndView showHomePage() {
		ModelAndView model = new ModelAndView("home");
		return model;
	}

	@RequestMapping(value = "/userRegistration.htm", method = RequestMethod.GET)
	public ModelAndView showUserRegistrationPage(User user) {

		ModelAndView model = new ModelAndView("userRegistration");

		return model;
	}

	@RequestMapping(value = "/submitRegistration.htm", method = RequestMethod.POST)
	public ModelAndView submitUserRegistrationPage(User user) {

		userService.registerUser(user);
		
		ModelAndView model = new ModelAndView("login");

		return model;
	}
	
	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public ModelAndView loginPage(String loginname) {

		ModelAndView model = new ModelAndView("login");

		return model;
	}
	
	@RequestMapping(value = "/loginUser.htm", method = RequestMethod.POST)
	public ModelAndView loginUserPage(@RequestParam("loginname") String loginname, @RequestParam("password") String password) {

		try {
			 user = userService.loginUser(loginname);	
		} catch (Exception e) {
		
			ModelAndView model = new ModelAndView("login");
			return model;
		}
		
		if (user.getPassword().equals(password)) {
			
			session.setAttribute("userId", user.getUserId());
			
			ModelAndView model = new ModelAndView("profile");
			return model;
		} else {
			ModelAndView model = new ModelAndView("login");
			return model;
		}

	}
}
