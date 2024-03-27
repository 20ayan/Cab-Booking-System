package org.cabbookingweb.service;

import java.util.List;
import java.util.Optional;

import org.cabbookingweb.entities.Cab;
import org.cabbookingweb.repository.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component("cabService")
public class CabServiceImpl implements CabService{

	//@Autowired
	private CabRepository repository;
	
	@Override
	public Cab addCab(Cab cab) {
		
		Optional<Cab> opt = repository.findById(cab.getCabId());
		if(opt.isPresent()) {
			
			return null;
		}
		repository.save(cab);
		return cab;
	}

	@Override
	public Cab updateCab(Cab cab) {
		Optional<Cab> opt = repository.findById(cab.getCabId());
		if(opt.isPresent()) {
			repository.save(cab);
			return cab;
		}
		return null;
	}

	@Override
	public Cab deleteCab(Integer cabId) {
		Optional<Cab> opt = repository.findById(cabId);
		if(opt.isPresent()) {
			Cab cab = opt.get();
			repository.delete(cab);
			return cab;
		}
		return null;
	}

	@Override
	public Cab findById(Integer cabId) {
		Optional<Cab> opt = repository.findById(cabId);
		if(opt.isPresent()) {
			Cab cab = opt.get();
			return cab;
		}
		return null;
	}

	@Override
	public List<Cab> findBycabType(String cabType) {
		
		List<Cab> cabs = repository.findByType(cabType);
		return cabs;
	}

	@Override
	public Integer countBycabType(String cabType) {
		
		List<Cab> listcab = repository.findAll();
		return listcab.size();
	}
	
	

}
