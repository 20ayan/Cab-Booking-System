package org.cabbookingweb.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@javax.persistence.Entity
public class Driver extends AbstractUser {

	@javax.persistence.Id
	private Integer driverId;
	private String licenceNo;
	private Float rating;

	@javax.persistence.OneToOne
	private Cab cabId;

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(Integer driverId, String licenceNo, Float rating, Cab cab, String userName, String password,
			String mobileNumber, String email) {
		super(userName, password, mobileNumber, email);
		this.driverId = driverId;
		this.licenceNo = licenceNo;
		this.rating = rating;
		this.cabId = cab;
		// TODO Auto-generated constructor stub
	}

	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Cab getCab() {
		return cabId;
	}

	public void setCab(Cab cab) {
		this.cabId = cab;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", licenceNo=" + licenceNo + ", rating=" + rating + ", cab=" + cabId.getCabId()
				+ "]";
	}
	

}
