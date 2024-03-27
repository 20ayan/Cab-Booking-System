package org.cabbookingweb.repository;

import java.util.List;

import org.cabbookingweb.entities.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepository extends JpaRepository<Cab, Integer>{
	
//	public Cab addCab(Cab cab);
//
//	public Cab updateCab(Cab cab);
//
//	public Cab deleteCab(Integer cabId);
	
	@Query("select distinct carType from Cab")
	public List<Cab> findByType(String cabType);



}
