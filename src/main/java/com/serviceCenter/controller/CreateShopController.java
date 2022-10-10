package com.serviceCenter.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.serviceCenter.entitiy.CreateShops;
import com.serviceCenter.service.CreateShopService;

@Controller
public class CreateShopController {
	@Autowired
	public CreateShopService createShopService;

	@GetMapping("/CreateShopPage")
	public String ShowCreateShopPage() {
		return "CreateShop";
	}

	@PostMapping("/CreateShop")
	public ModelAndView CreateShop(@ModelAttribute CreateShops createShops,
			@RequestParam("shopImage1") MultipartFile image, HttpServletRequest request) {
		HttpSession session = request.getSession();
		ModelAndView modelAndView = new ModelAndView();
		try {
			this.createShopService.createShop(createShops, image, (int) session.getAttribute("userId"));
			modelAndView.addObject("createshop", "ShopCreate sucessfully !!");
			modelAndView.setViewName("CreateShop");
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView;

		}
	}

}
