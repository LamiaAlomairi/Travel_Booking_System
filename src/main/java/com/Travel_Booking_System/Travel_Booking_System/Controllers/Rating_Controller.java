package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Rating;
import com.Travel_Booking_System.Travel_Booking_System.Services.Rating_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rating")
public class Rating_Controller {
    //    http://localhost:8080/rating/getAll
    @Autowired
    Rating_Service rating_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Rating> getAllRatings() {

        return rating_service.getAllRatings();
    }
    @GetMapping(value = "getById")
    public Rating getRatingById(@RequestParam Long id) {

        return rating_service.getRatingById(id);
    }
}
