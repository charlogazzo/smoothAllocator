package com.charlogazzo.smoothallocator.api;

import com.charlogazzo.smoothallocator.model.Merchandise;
import com.charlogazzo.smoothallocator.service.MerchandiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchandise")
public class MerchandiseAPI {
    @Autowired
    MerchandiseService merchandiseService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Merchandise> addMerchandise() {
        Merchandise merchandise = merchandiseService.addMerchandise(new Merchandise());
        return new ResponseEntity<>(merchandise, HttpStatus.OK);
    }
}
