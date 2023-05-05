package com.charlogazzo.smoothallocator.service;

import com.charlogazzo.smoothallocator.model.Location;
import com.charlogazzo.smoothallocator.model.Merchandise;
import com.charlogazzo.smoothallocator.model.Warehouse;

import java.util.List;

public interface SmoothAllocatorService {
    double getUsableWarehouseVolumeForMerchandise(Warehouse warehouse);

    List<Location> getPossibleOptimizedLocationsForMerchandise(Warehouse warehouse, Merchandise merchandise,
                                                                      int numberOfMerchandiseUnits);
}
