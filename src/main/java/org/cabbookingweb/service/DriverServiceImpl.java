package org.cabbookingweb.service;

import java.util.List;
import java.util.Optional;

import org.cabbookingweb.entities.Driver;
import org.cabbookingweb.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component("driverService")
public class DriverServiceImpl implements DriverService {

	//@Autowired
	private DriverRepository repository;

	@Override
	public Driver addDriver(Driver driver) {
		Optional<Driver> opt = repository.findById(driver.getDriverId());
		if (opt.isPresent()) {
			return null;
		}
		repository.save(driver);
		return driver;
	}

	@Override
	public Driver updateDriver(Driver driver) {
		Optional<Driver> opt = repository.findById(driver.getDriverId());
		if (opt.isPresent()) {
			repository.save(driver);
			return driver;
		}
		
		return null;
	}

	@Override
	public Driver deleteDriver(Integer driverId) {
		Optional<Driver> opt = repository.findById(driverId);
		if (opt.isPresent()) {
			Driver driver = opt.get();
			repository.delete(driver);
			return driver;
		}
		
		return null;
	}

	@Override
	public List<Driver> getBestDrivers() {
		List<Driver> drivers= repository.findBestDriver();
		if(drivers.size()>0)
			return drivers;
		return null;
	}

	@Override
	public Driver findById(Integer driverId) {
		return findById(driverId);
	}

}
