package com.charlogazzo.smoothallocator.repository;

import com.charlogazzo.smoothallocator.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, String> {
}
