package com.serviceCenter.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.serviceCenter.entitiy.CreateShops;
import com.serviceCenter.entitiy.User;

@Repository
public interface CreateShopsRepository  extends JpaRepository<CreateShops, Integer>{
	
	@Query("select cs from CreateShops cs where cs.ownerId=:ownerId")
	public List<CreateShops> findallcreateShops(@Param("ownerId") User ownerId);
  

}
