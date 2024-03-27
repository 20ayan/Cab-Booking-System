package org.cabbookingweb.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@javax.persistence.Entity
public class Customer extends AbstractUser {

	@javax.persistence.Id
	private Integer customerId;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, String userName, String password, String mobileNumber, String email) {

		super(userName, password, mobileNumber, email);
		this.customerId = customerId;
		// TODO Auto-generated constructor stub
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "] | " + super.toString();
	}

}
