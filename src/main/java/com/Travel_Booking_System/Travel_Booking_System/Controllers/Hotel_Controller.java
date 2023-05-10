package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Hotel;
import com.Travel_Booking_System.Travel_Booking_System.Services.Hotel_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "hotel")
public class Hotel_Controller {
    //    http://localhost:8080/hotel/getAll
    @Autowired
    Hotel_Service hotel_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Hotel> getAllHotels() {

        return hotel_service.getAllHotels();
    }
    @GetMapping(value = "getById")
    public Hotel getHotelById(@RequestParam Long id) {

        return hotel_service.getHotelById(id);
    }
}
