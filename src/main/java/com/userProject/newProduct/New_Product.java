package com.userProject.newProduct;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class New_Product {
	@Id
    @Column(name = "NewPId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String country;
	private String productType;
	private String standardEnergy;

	
	public New_Product() {}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getStandardEnergy() {
		return standardEnergy;
	}
	public void setStandardEnergy(String standardEnergy) {
		this.standardEnergy = standardEnergy;
	}
	
}
