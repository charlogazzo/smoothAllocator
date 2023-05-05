package com.charlogazzo.smoothallocator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

@AllArgsConstructor
@Builder
public class Depot {
    private List<Warehouse> warehouses;
}
