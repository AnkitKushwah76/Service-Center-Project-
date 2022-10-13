package com.serviceCenter.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.serviceCenter.entitiy.CreateShops;
import com.serviceCenter.entitiy.TypesOfServices;
import com.serviceCenter.service.CreateShopService;
import com.serviceCenter.serviceImp.AddServicesImp;

@Controller
public class CreateShopController {
	
	@Autowired public CreateShopService createShopService;
	
	@Autowired public AddServicesImp addServicesImp;
	
	
	
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
	
	@GetMapping("/addServices")
	public String addServices(@RequestParam("servicesCenterId") int servicesCenterId,
			@RequestParam("servicesCenterName") String servicesCenterName, HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("addServices", servicesCenterId);
		session.setAttribute("servicesCenterName", servicesCenterName);
		return "addServices";
	}

   @PostMapping("/addService")
	public RedirectView deletePost(@ModelAttribute TypesOfServices typesOfServices,
			HttpServletRequest request) {
		HttpSession session=request.getSession();

		RedirectView redirectView = new RedirectView();
		// this.deletePostImp.userDeletePost(postId);
		this.addServicesImp.addServices(typesOfServices.getAddServices(),session);
		redirectView.setUrl("showOwnerProfile");
		return redirectView;

	}

}
