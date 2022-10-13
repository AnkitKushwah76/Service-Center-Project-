package com.serviceCenter.serviceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.serviceCenter.Repository.UserRepository;
import com.serviceCenter.entitiy.User;
import com.serviceCenter.service.UserService;
@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User userSignup(User user) {
		String userNmae = user.getUserName();
		String userEmail = user.getUserEmail();
		String userPassword = user.getUserPassword();
		String userRole = user.getRole();
		user.setRole(userRole);
		user.setUserName(userNmae);
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);

		return this.userRepository.save(user);
	}

		@Transactional
		public String userLogin(User user, HttpServletRequest request) {

			HttpSession session = request.getSession();
			User user1 = this.userRepository.findByUserEmailAndUserPassword(user.getUserEmail(), user.getUserPassword());
				if (user1 != null) {
			session.setAttribute("userId", user1.getId());
				session.setAttribute("userName", user1.getUserName());
				session.setAttribute("userEmail", user1.getUserEmail());

				if (user1.getRole().equals("Admin")){
					return "Admin";
				}
				
				if (user1.getRole().equals("ServiceCenterOwner")){
					return "ServiceCenterOwner";
				}
				if (user1.getRole().equals("Clint")){
					return "Clint";
				}
				
				} 
				else {

				return "error";
			}
				return null;

		}
		
		
		

	
	}


