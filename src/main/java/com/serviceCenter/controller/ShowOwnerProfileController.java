package com.serviceCenter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.serviceCenter.serviceImp.UserServiceImp;

@Controller
public class ShowOwnerProfileController {
	
	@Autowired private UserServiceImp userserviceImp;
	@RequestMapping("/showOwnerProfile")
	public ModelAndView showOwnerProfile(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ModelAndView modelAndView=new ModelAndView();
		try {
			//modelAndView.addObject("showAllFollowers", this.userserviceImp.getProfile((int) session.getAttribute("userId")));
			modelAndView.setViewName("showAllFollowersPost");
			return modelAndView;
			}
			catch(Exception e)
			{
				modelAndView.setViewName("login");
				return modelAndView;


			}

	}
	
	


}
