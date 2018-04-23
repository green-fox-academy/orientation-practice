package com.greenfox.academy.travelagency.services;

import com.greenfox.academy.travelagency.models.Attraction;
import com.greenfox.academy.travelagency.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.*;

import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService {

    private final AttractionRepository attractionRepository;

    @Autowired
    public AttractionServiceImpl(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @Override
    public List<Attraction> findAll() {
        return (List<Attraction>) attractionRepository.findAll();
    }

    @Override
    public void save(Attraction attraction) {
        attractionRepository.save(attraction);
    }

    @Override
    public Attraction findById(int id) {
        return attractionRepository.findById(id);
    }

    @Override
    public List<Attraction> placeForME(String city, String category) {
        if (city == null) {
            if (category == null) {
                return (List<Attraction>) attractionRepository.findAll();
            } else {
                return attractionRepository.findAllByCategory(category);
            }
        } else if (category == null) {

        }
    }
}
