package com.charlogazzo.smoothallocator.service;

import com.charlogazzo.smoothallocator.model.Location;
import com.charlogazzo.smoothallocator.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public void addLocation(Location location) {
        locationRepository.save(
                Location.builder()
                        .locationID("AB-1234")
                        .volume(350)
                        .build()
        );
    }
}
