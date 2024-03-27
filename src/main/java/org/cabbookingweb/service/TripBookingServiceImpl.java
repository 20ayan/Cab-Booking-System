package org.cabbookingweb.service;

import java.util.List;
import java.util.Optional;

import org.cabbookingweb.entities.TripBooking;
import org.cabbookingweb.repository.TripBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripBookingServiceImpl implements TripBookingService {

	//@Autowired
	private TripBookingRepository repository;

	@Override
	public TripBooking addTripBooking(TripBooking tripBooking) {
		Optional<TripBooking> opt = repository.findById(tripBooking.getTripBookingId());
		if (opt.isPresent()) {

			return null;
		}
		repository.save(tripBooking);
		return tripBooking;
	}

	@Override
	public TripBooking updateTripBooking(TripBooking tripBooking) {
		Optional<TripBooking> opt = repository.findById(tripBooking.getTripBookingId());
		if (opt.isPresent()){
			repository.save(tripBooking);
			return tripBooking;

		}
		return null;
	}

	@Override
	public TripBooking deleteTripBooking(Integer tripBookingId) {
		Optional<TripBooking> opt = repository.findById(tripBookingId);
		if (opt.isPresent()) {
			TripBooking tripBooking = opt.get();
			repository.delete(tripBooking);
			return tripBooking;

		}
		return null;
	}

	@Override
	public List<TripBooking> findAllTrips(Integer customerId) {
		return repository.findAll();
	}

//	@Override
//	public TripBooking calculateBill(Integer customerId) {
//		return repository;
//	}

}
