package com.charlogazzo.smoothallocator.service;

import com.charlogazzo.smoothallocator.model.Location;
import com.charlogazzo.smoothallocator.model.Merchandise;
import com.charlogazzo.smoothallocator.model.MerchandiseDimensions;
import com.charlogazzo.smoothallocator.repository.MerchandiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchandiseService {
    @Autowired
    MerchandiseRepository merchandiseRepository;

    public Merchandise addMerchandise(Merchandise merchandise) {
        return merchandiseRepository.save(
                Merchandise.builder()
                        .merchandiseID("12345")
                        .dimensions(MerchandiseDimensions.MEDIUM)
                        .build()
        );
    }

    public void removeMerchandise(String merchandiseID) {
        merchandiseRepository.removeByMerchandiseID(merchandiseID);
    }

}
