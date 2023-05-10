package com.Travel_Booking_System.Travel_Booking_System.Services;

import com.Travel_Booking_System.Travel_Booking_System.Models.Rating;
import com.Travel_Booking_System.Travel_Booking_System.Repositories.Rating_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Rating_Service {
    @Autowired
    Rating_Repository rating_repository;
    public List<Rating> getAllRatings() {

        return rating_repository.findAll();
    }

    public Rating getRatingById(Long id) {

        return rating_repository.findById(id).get();
    }
}
