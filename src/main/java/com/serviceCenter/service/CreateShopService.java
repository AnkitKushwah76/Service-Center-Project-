package com.serviceCenter.service;
import org.springframework.web.multipart.MultipartFile;

import com.serviceCenter.dto.ShowOwnerProfileDto;
import com.serviceCenter.entitiy.CreateShops;

public interface CreateShopService {
	
	public CreateShops createShop(CreateShops createShops,MultipartFile image,int ownerId);
	public ShowOwnerProfileDto getOwnerProfileDto(int ownerId);


	
}
