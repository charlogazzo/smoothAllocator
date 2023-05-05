package com.charlogazzo.smoothallocator.service;

import com.charlogazzo.smoothallocator.model.Location;
import com.charlogazzo.smoothallocator.model.Merchandise;

public interface MerchandiseHandlingService {
    void addMerchandise(Merchandise merchandise);

    void removeMerchandise(String merchandiseID);

    void moveMerchandise(String merchandiseID, Location sourceLocation, Location destinationLocation, int amountToBeMoved);

}
