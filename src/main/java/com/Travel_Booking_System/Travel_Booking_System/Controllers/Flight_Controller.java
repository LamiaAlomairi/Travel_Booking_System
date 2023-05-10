package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Flight;
import com.Travel_Booking_System.Travel_Booking_System.Services.Flight_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "flight")
public class Flight_Controller {
    //    http://localhost:8080/flight/getAll
    @Autowired
    Flight_Service flight_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Flight> getAllFlights() {

        return flight_service.getAllFlights();
    }
    @GetMapping(value = "getById")
    public Flight getFlightById(@RequestParam Long id) {

        return flight_service.getFlightById(id);
    }
}
