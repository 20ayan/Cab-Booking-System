package org.cabbookingweb.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@javax.persistence.Entity
public class Cab {
	
	@javax.persistence.Id
	private Integer cabId;
	private String carType;
	private Float perKmRate;
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cab(Integer cabId, String carType, Float perKmRate) {
		super();
		this.cabId = cabId;
		this.carType = carType;
		this.perKmRate = perKmRate;
	}
	public Integer getCabId() {
		return cabId;
	}
	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public Float getPerKmRate() {
		return perKmRate;
	}
	public void setPerKmRate(Float perKmRate) {
		this.perKmRate = perKmRate;
	}
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", carType=" + carType + ", perKmRate=" + perKmRate + "]";
	}
	
	

}
