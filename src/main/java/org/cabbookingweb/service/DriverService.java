package org.cabbookingweb.service;

import java.util.List;

import org.cabbookingweb.entities.Driver;
import org.springframework.stereotype.Service;

@Service
public interface DriverService {
	public Driver addDriver(Driver driver);

	public Driver updateDriver(Driver driver);

	public Driver deleteDriver(Integer driverId);

	public List<Driver> getBestDrivers();

	public Driver findById(Integer driverId);
}
