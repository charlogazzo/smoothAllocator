package com.charlogazzo.smoothallocator.repository;

import com.charlogazzo.smoothallocator.model.Merchandise;

import java.util.List;

public interface AllocatorRepository {
    void addMerchandise(Merchandise merchandise);

    void addMerchandise(List<Merchandise> merchandiseList);
}
