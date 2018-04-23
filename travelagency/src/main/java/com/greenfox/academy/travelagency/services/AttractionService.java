package com.greenfox.academy.travelagency.services;

import com.greenfox.academy.travelagency.models.Attraction;

import java.util.List;

public interface AttractionService {

    List<Attraction> findAll();

    void save(Attraction attraction);

    Attraction findById(int id);

    List<Attraction> placeForME(String city, String category);
}
