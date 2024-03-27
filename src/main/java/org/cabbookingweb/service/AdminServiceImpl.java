package org.cabbookingweb.service;

import java.time.LocalDate;


import java.util.List;
import java.util.Optional;

import org.cabbookingweb.entities.Admin;
import org.cabbookingweb.entities.Customer;
import org.cabbookingweb.entities.TripBooking;
import org.cabbookingweb.repository.AdminRepository;
import org.cabbookingweb.repository.CustomerRepository;
import org.cabbookingweb.repository.TripBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService{
	
	//@Autowired
	private AdminRepository repository;
	@Autowired
	private CustomerRepository customerrepo;
	
	@Autowired
	private TripBookingRepository triprepo;

	@Override
	public Admin addAdmin(Admin admin) {
		
		Optional<Admin> opt = repository.findById(admin.getAdminId());
		if(opt.isPresent()) {
			return null;
		}
		repository.save(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Optional<Admin> opt = repository.findById(admin.getAdminId());
		if(opt.isPresent()) {
			repository.save(admin);
			return admin;
		}
		return null;
	}

	@Override
	public Admin deleteAdmin(Integer adminId) {
		Optional<Admin> opt = repository.findById(adminId);
		if(opt.isPresent()) {
			Admin admin = opt.get();
			repository.delete(admin);
			return admin;
		}
		return null;
	}

	@Override
	public List<TripBooking> findAllTrips(Integer customerId) {
			//customer exception
			Optional<Customer> opt = customerrepo.findById(customerId);
			if(opt.isPresent()) {
				List<TripBooking> trips = triprepo.findAll();
				return trips;
			
			}
			return null;
	}

	@Override
	public List<TripBooking> findAllTripsCabwise() {
		// TODO Auto-generated method stub
		List<TripBooking> list=triprepo.findByDriverAsc();
		if(list.size()>0)
			return list;
		return null;
	}

	@Override
	public List<TripBooking> findAllTripsCustomerwise() {

		List<TripBooking> list = triprepo.findByCustomeridAsce();
		if(list.size() > 0)
			return list;
		return null;
	}

	@Override
	public List<TripBooking> findAllTripsDatewise() {
	
		List<TripBooking> list = triprepo.findByFromdate_timeAsce();
		if(list.size() > 0)
			return list;
		return null;
	}

//	@Override
//	public List<TripBooking> findAllTripsForDayes(Integer customerId, LocalDate fromDate, LocalDate toDate) {
//		
//		List<TripBooking> list =triprepo.findByCustomerIdAndFromdate_time(customerId,fromDate, toDate);
//		if(list.size() > 0)
//			return list;
//		return null;
//	}

	@Override
	public List<Admin> findAll() {
		return repository.findAll();
	}

	@Override
	public Admin findById(Integer adminId) {
		Optional<Admin> opt = repository.findById(adminId);
		if(opt.isPresent()) {
			Admin admin = opt.get();
			return admin;
		}
		return null;
	}

}
