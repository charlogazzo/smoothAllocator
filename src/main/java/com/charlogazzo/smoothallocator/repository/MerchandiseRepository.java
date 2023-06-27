package com.charlogazzo.smoothallocator.repository;

import com.charlogazzo.smoothallocator.model.Merchandise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchandiseRepository extends JpaRepository<Merchandise, String> {
    Merchandise findByMerchandiseIDIgnoreCase(String merchandiseID);
    long removeByMerchandiseID(String merchandiseID);
}
