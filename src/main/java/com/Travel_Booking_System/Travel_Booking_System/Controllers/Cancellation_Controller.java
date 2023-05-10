package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Cancellation;
import com.Travel_Booking_System.Travel_Booking_System.Services.Cancellation_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "cancellation")
public class Cancellation_Controller {
    //    http://localhost:8080/cancellation/getAll
    @Autowired
    Cancellation_Service cancellation_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Cancellation> getAllCancellations() {

        return cancellation_service.getAllCancellations();
    }
    @GetMapping(value = "getById")
    public Cancellation getCancellationById(@RequestParam Long id) {

        return cancellation_service.getCancellationById(id);
    }
}
