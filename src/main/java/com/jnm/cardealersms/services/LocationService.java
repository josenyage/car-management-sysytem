package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Country;
import com.jnm.cardealersms.model.Location;
import com.jnm.cardealersms.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    public List<Location> getLocation() {
        return locationRepository.findAll();
    }

    public void save(Location location) {
        locationRepository.save(location);
    }

    public Optional<Location> findById(Integer id) {
        return locationRepository.findById(id);
    }

    public void delete(int id) {
        locationRepository.deleteById(id);
    }
}
