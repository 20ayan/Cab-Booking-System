package org.cabbookingweb.entities;

import java.time.LocalDate;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@javax.persistence.Entity
public class TripBooking {

	@javax.persistence.Id
	private Integer tripBookingId;
	private String fromLocation;
	private String toLocation;
	private LocalDate fromDateTime;
	private LocalDate toDateTime;
	private Boolean status;
	private Float distanceInKm;
	private Float bill;

	@javax.persistence.OneToOne
	private Customer customerId;
	
	@javax.persistence.ManyToOne
	private Driver driverId;

	public TripBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TripBooking(Integer tripBookingId, String fromLocation, String toLocation, LocalDate fromDateTime,
			LocalDate toDateTime, Boolean status, Float distanceInKm, Float bill, Customer customerId,
			Driver driverId) {
		super();
		this.tripBookingId = tripBookingId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.fromDateTime = fromDateTime;
		this.toDateTime = toDateTime;
		this.status = status;
		this.distanceInKm = distanceInKm;
		this.bill = bill;
		this.customerId = customerId;
		this.driverId = driverId;
	}

	public Integer getTripBookingId() {
		return tripBookingId;
	}

	public void setTripBookingId(Integer tripBookingId) {
		this.tripBookingId = tripBookingId;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public LocalDate getFromDateTime() {
		return fromDateTime;
	}

	public void setFromDateTime(LocalDate fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	public LocalDate getToDateTime() {
		return toDateTime;
	}

	public void setToDateTime(LocalDate toDateTime) {
		this.toDateTime = toDateTime;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Float getDistanceInKm() {
		return distanceInKm;
	}

	public void setDistanceInKm(Float distanceInKm) {
		this.distanceInKm = distanceInKm;
	}

	public Float getBill() {
		return bill;
	}

	public void setBill(Float bill) {
		this.bill = bill;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Driver getDriverId() {
		return driverId;
	}

	public void setDriverId(Driver driverId) {
		this.driverId = driverId;
	}

	@Override
	public String toString() {
		return "TripBooking [tripBookingId=" + tripBookingId + ", fromLocation=" + fromLocation + ", toLocation="
				+ toLocation + ", fromDateTime=" + fromDateTime + ", toDateTime=" + toDateTime + ", status=" + status
				+ ", distanceInKm=" + distanceInKm + ", bill=" + bill + ", customerId=" + customerId + ", driverId="
				+ driverId + "]";
	}

}
