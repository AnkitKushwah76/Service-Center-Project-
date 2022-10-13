package com.serviceCenter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.serviceCenter.Repository.CreateShopsRepository;

@Controller
public class ClintController {
	@Autowired
	private CreateShopsRepository createShopsRepository;

	@RequestMapping("/showAllServices")
	public ModelAndView showAllServices() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("findAllServices", createShopsRepository.findAll());
		System.out.println("createShopsRepository.findAll()-->"+createShopsRepository.findAll());
		modelAndView.setViewName("showAllServices");
		return modelAndView;
	}
	
	@GetMapping("/showAllService")
	public String addServices(@RequestParam("servicesCenterId") int servicesCenterId, HttpServletRequest request) {
		HttpSession session=request.getSession();
		System.out.println("servicesCenterId-->"+servicesCenterId);
		session.setAttribute("servicesCenterId", servicesCenterId);
		
		return "bookServiceCenter";
	}
}
