package com.serviceCenter.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CreateShops")
public class CreateShops {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String shopName;
	private String address;
	private String location;
	
	@OneToOne
	@JoinColumn(name="ownerId")
	private User ownerId;
	
	private String shopImage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getShopImage() {
		return shopImage;
	}
	public void setShopImage(String shopImage) {
		this.shopImage = shopImage;
	}
	public User getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(User ownerId) {
		this.ownerId = ownerId;
	}
	@Override
	public String toString() {
		return "CreateShops [id=" + id + ", shopName=" + shopName + ", address=" + address + ", location=" + location
				+ ", ownerId=" + ownerId + ", shopImage=" + shopImage + "]";
	}
	
	
}
