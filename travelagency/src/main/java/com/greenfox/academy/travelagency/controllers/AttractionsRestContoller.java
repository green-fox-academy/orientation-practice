package com.greenfox.academy.travelagency.controllers;

import com.greenfox.academy.travelagency.models.Attraction;
import com.greenfox.academy.travelagency.services.AttractionService;
import com.greenfox.academy.travelagency.services.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttractionsRestContoller {


    private final AttractionServiceImpl attractionServiceImpl;

    @Autowired
    public AttractionsRestContoller(AttractionServiceImpl attractionServiceImpl) {
        this.attractionServiceImpl = attractionServiceImpl;
    }


    @GetMapping("/")
    public List<Attraction> attractions(@RequestParam(name = "city", required = false) String city,
                                        @RequestParam(name = "category", required = false) String category) {
        return attractionServiceImpl.placeForME(city, category);
    }

}
