package org.cabbookingweb.repository;

import java.util.List;

import org.cabbookingweb.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

//	public Customer addCustomer(Customer customer);
//
//	public Customer updateCustomer(Customer customer);
//
//	public Customer deleteCustomer(Integer customerId);
//
//	public Customer findById(Integer customerId);
//
//	public List<Customer> findAll();

	//public Customer validateCustomer(String username, String password);

}
