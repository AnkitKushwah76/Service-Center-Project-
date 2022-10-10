package com.serviceCenter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.serviceCenter.entitiy.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUserEmailAndUserPassword(@Param("email") String email, @Param("password") String password);

}
