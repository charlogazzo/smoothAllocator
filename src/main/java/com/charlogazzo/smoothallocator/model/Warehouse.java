package com.charlogazzo.smoothallocator.model;

import lombok.Builder;

import java.util.List;

@Builder
public class Warehouse {
    private String WarehouseID;
    private List<Location> locations;
}
