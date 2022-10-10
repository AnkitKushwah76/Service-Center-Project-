package com.serviceCenter.service;

import javax.servlet.http.HttpServletRequest;

import com.serviceCenter.entitiy.User;

public interface UserService {

	public User userSignup(User user);

	public String userLogin(User user, HttpServletRequest request);

}
