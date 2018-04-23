package com.greenfox.academy.travelagency.repositories;

import com.greenfox.academy.travelagency.models.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Integer> {
    List<Attraction> findAllByCityAndCategory(String city, String category);
    List<Attraction> findAllByCity(String city);
    List<Attraction> findAllByCategory(String category);
    Attraction findById(int id);
}
