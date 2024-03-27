package org.cabbookingweb.repository;

import java.time.LocalDateTime;
import java.util.List;
import org.cabbookingweb.entities.Admin;
import org.cabbookingweb.entities.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

//	public Admin addAdmin(Admin admin);
//
//	public Admin updateAdmin(Admin admin);
//
//	public Admin deleteAdmin(Integer adminId);
//
//	public Admin findById(Integer adminId);
//
//	public List<Admin> findAll();

	

}
