package com.serviceCenter.serviceImp;

import java.io.File;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.serviceCenter.Repository.CreateShopsRepository;
import com.serviceCenter.entitiy.CreateShops;
import com.serviceCenter.service.CreateShopService;

@Service
public class CreateShopsServicImp implements CreateShopService {

	@Autowired
	private CreateShopsRepository createShopsRepository;

	@Override
	public CreateShops createShop(CreateShops createShops, MultipartFile image, int ownerId) {

		String path = "D:\\Spring-Boot-Projects\\ServiceCenter-Project\\src\\main\\webapp\\view\\ServiceCenterImage";

		try {
			InputStream imageStream = image.getInputStream();
			byte data[] = new byte[imageStream.available()];
			imageStream.read(data);

			FileOutputStream fileOutputStream = new FileOutputStream(
					path + File.separator + image.getOriginalFilename());
			fileOutputStream.write(data);
			fileOutputStream.flush();
			fileOutputStream.close();
			createShops.setShopImage(image.getOriginalFilename());
			createShops.setAddress(createShops.getAddress());
			createShops.setLocation(createShops.getLocation());
			createShops.setShopName(createShops.getShopName());
			//createShops.setOwnerId(ownerId);

			return this.createShopsRepository.save(createShops);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
