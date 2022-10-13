package com.serviceCenter.service;

import javax.servlet.http.HttpSession;

import com.serviceCenter.entitiy.TypesOfServices;

public interface AddServices {


	public TypesOfServices addServices(String addServices, HttpSession session);

}
