package com.serviceCenter.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.serviceCenter.entitiy.User;
import com.serviceCenter.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/signup")
	public String signup() {
		return "signup";
	}

	// handler for registerUser
	@PostMapping("/register")
	public ModelAndView registerUser(@ModelAttribute User user, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		this.userService.userSignup(user);
		modelAndView.addObject("sucessfull", "Registration Sucessfully !!");
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping("/signin")
	public String signin() {
		return "login";
	}

	// handler for loginUser
	@PostMapping("/login")
	public String loginPage(@ModelAttribute User user, Model model, HttpServletRequest request) {

		HttpSession session = request.getSession();
		// String userLogin = userService.userLogin(user, request);

		if (userService.userLogin(user, request).equals("ServiceCenterOwner")) {
			return "ServiceCenterOwner";
		} 
		if (userService.userLogin(user, request).equals("Admin")) {
			return "Admin";
		} 
		if (userService.userLogin(user, request).equals("Clint")) {
			return "Clint";
		} 
		else {
			session.setAttribute("error", "Invalid username and Password");
		}
		return "login";

	}

	@RequestMapping("/logout")
	public String logout(Model model) {

		model.addAttribute("logout", "logout Sucessfully !!");
		return "login";
	}

}
