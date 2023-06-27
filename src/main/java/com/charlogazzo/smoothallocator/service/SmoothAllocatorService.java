package com.charlogazzo.smoothallocator.service;

import com.charlogazzo.smoothallocator.model.Location;
import com.charlogazzo.smoothallocator.model.Merchandise;
import com.charlogazzo.smoothallocator.model.Warehouse;
import com.charlogazzo.smoothallocator.repository.MerchandiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SmoothAllocatorService {
    @Autowired
    private MerchandiseRepository merchandiseRepository;
    double getUsableWarehouseVolumeForMerchandise(Warehouse warehouse) {
        return 0.0;
    }

    List<Location> getPossibleOptimizedLocationsForMerchandise(Warehouse warehouse, Merchandise merchandise,
                                                                      int numberOfMerchandiseUnits) {
        return List.of();
    }

    public void moveMerchandise(String merchandiseID, Location sourceLocation, Location destinationLocation, int amountToBeMoved) {
        Merchandise merchandise = merchandiseRepository.findByMerchandiseIDIgnoreCase(merchandiseID);
    }
}
