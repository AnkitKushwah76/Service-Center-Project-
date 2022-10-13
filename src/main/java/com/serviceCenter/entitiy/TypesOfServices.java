package com.serviceCenter.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TypesOfServices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String ShopsName;
	
	private int  ownerId;

	private String addServices;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getShopsName() {
		return ShopsName;
	}

	public void setShopsName(String shopsName) {
		ShopsName = shopsName;
	}

	public String getAddServices() {
		return addServices;
	}

	public void setAddServices(String addServices) {
		this.addServices = addServices;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public String toString() {
		return "TypesOfServices [id=" + id + ", ShopsName=" + ShopsName + ", ownerId=" + ownerId + ", addServices="
				+ addServices + "]";
	}

	

	

}
