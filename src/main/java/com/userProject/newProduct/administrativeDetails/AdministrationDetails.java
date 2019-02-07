package com.userProject.newProduct.administrativeDetails;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdministrationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String howSupplied;
	private String productManuCountry;
	private Date availableRegion;
	private Date availableCountry;
	private String dateMarketing;
	private String dateFormatExemple;
	private String testStandard;
	
	
	public String getHowSupplied() {
		return howSupplied;
	}
	public void setHowSupplied(String howSupplied) {
		this.howSupplied = howSupplied;
	}
	public String getProductManuCountry() {
		return productManuCountry;
	}
	public void setProductManuCountry(String productManuCountry) {
		this.productManuCountry = productManuCountry;
	}
	public Date getAvailableRegion() {
		return availableRegion;
	}
	public void setAvailableRegion(Date availableRegion) {
		this.availableRegion = availableRegion;
	}
	public Date getAvailableCountry() {
		return availableCountry;
	}
	public void setAvailableCountry(Date availableCountry) {
		this.availableCountry = availableCountry;
	}
	public String getDateMarketing() {
		return dateMarketing;
	}
	public void setDateMarketing(String dateMarketing) {
		this.dateMarketing = dateMarketing;
	}
	public String getDateFormatExemple() {
		return dateFormatExemple;
	}
	public void setDateFormatExemple(String dateFormatExemple) {
		this.dateFormatExemple = dateFormatExemple;
	}
	public String getTestStandard() {
		return testStandard;
	}
	public void setTestStandard(String testStandard) {
		this.testStandard = testStandard;
	}
}
