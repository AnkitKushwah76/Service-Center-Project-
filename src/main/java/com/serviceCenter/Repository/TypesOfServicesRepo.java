package com.serviceCenter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serviceCenter.entitiy.TypesOfServices;


@Repository
public interface TypesOfServicesRepo extends JpaRepository<TypesOfServices, Integer> {

}
