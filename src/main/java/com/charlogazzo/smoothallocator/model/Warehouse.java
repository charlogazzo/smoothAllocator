package com.charlogazzo.smoothallocator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;

import java.util.List;

@Entity
public class Warehouse {
    @Id
    private String WarehouseID;
    @OneToMany
    private List<Location> locations;
}
