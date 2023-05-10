package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Booking;
import com.Travel_Booking_System.Travel_Booking_System.Services.Booking_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "booking")
public class Booking_Controller {
    //    http://localhost:8080/booking/getAll
    @Autowired
    Booking_Service booking_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Booking> getAllBookings() {

        return booking_service.getAllBookings();
    }
    @GetMapping(value = "getById")
    public Booking getBookingById(@RequestParam Long id) {

        return booking_service.getBookingById(id);
    }
}
