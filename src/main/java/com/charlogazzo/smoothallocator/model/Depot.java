package com.charlogazzo.smoothallocator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Depot {
    @Id
    private String name;
    @OneToMany
    private List<Warehouse> warehouses;
}
