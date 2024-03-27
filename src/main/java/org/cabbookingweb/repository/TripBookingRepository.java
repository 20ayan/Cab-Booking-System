package org.cabbookingweb.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.cabbookingweb.entities.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TripBookingRepository extends JpaRepository<TripBooking, Integer>{
	
//	public TripBooking addTripBooking(TripBooking tripBooking);
//
//	public TripBooking updateTripBooking(TripBooking tripBooking);
//
//	public TripBooking deleteTripBooking(Integer tripBookingId);
	@Query("from TripBooking order by customerId")
	public List<TripBooking> findByCustomeridAsce();
	@Query("from TripBooking  order by fromDateTime")
	public List<TripBooking> findByFromdate_timeAsce();
	
	//@Query("from TripBooking where customerId=:customerId AND1 fromDateTime=date AND toDateTime=toDate")
	//public List<TripBooking> findByCustomerIdAndFromdate_time(Integer customerId, LocalDate date,LocalDate toDate);
	
	@Query("from TripBooking group by driverId ORDER by driverId")
	public List<TripBooking> findByDriverAsc();
	
}
