package com.charlogazzo.smoothallocator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Merchandise {
    @Id
    private String merchandiseID;
    private MerchandiseDimensions dimensions;
}
