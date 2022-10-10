package com.serviceCenter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serviceCenter.entitiy.CreateShops;

@Repository
public interface CreateShopsRepository  extends JpaRepository<CreateShops, Integer>{

}
