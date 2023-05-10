package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Review;
import com.Travel_Booking_System.Travel_Booking_System.Services.Review_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "review")
public class Review_Controller {
    //    http://localhost:8080/review/getAll
    @Autowired
    Review_Service review_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Review> getAllReviews() {

        return review_service.getAllReviews();
    }
    @GetMapping(value = "getById")
    public Review getReviewById(@RequestParam Long id) {

        return review_service.getReviewById(id);
    }
}
