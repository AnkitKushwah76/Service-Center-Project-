package com.serviceCenter.serviceImp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceCenter.Repository.TypesOfServicesRepo;
import com.serviceCenter.entitiy.TypesOfServices;
import com.serviceCenter.service.AddServices;

@Service
public class AddServicesImp implements AddServices {

	@Autowired private TypesOfServicesRepo typesOfServicesRepo;
	@Override
	public TypesOfServices addServices(String addServices, HttpSession session) {

		TypesOfServices typesOfServices = new TypesOfServices();
		
		System.out.println("aaaa-->"+(int) session.getAttribute("addServices"));
		typesOfServices.setShopsName((String) session.getAttribute("servicesCenterName"));
		typesOfServices.setOwnerId((int) session.getAttribute("addServices"));
		typesOfServices.setAddServices(addServices);
		return 	typesOfServicesRepo.save(typesOfServices);

	}

}
