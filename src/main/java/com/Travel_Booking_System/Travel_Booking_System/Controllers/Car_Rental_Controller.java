package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Car_Rental;
import com.Travel_Booking_System.Travel_Booking_System.Services.Car_Rental_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "car_rental")
public class Car_Rental_Controller {
    //    http://localhost:8080/car_rental/getAll
    @Autowired
    Car_Rental_Service car_rental_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Car_Rental> getAllCar_Rentals() {

        return car_rental_service.getAllCar_Rentals();
    }
    @GetMapping(value = "getById")
    public Car_Rental getCar_RentalById(@RequestParam Long id) {

        return car_rental_service.getCar_RentalById(id);
    }
}
