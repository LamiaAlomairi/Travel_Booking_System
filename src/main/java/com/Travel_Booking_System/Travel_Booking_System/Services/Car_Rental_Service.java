package com.Travel_Booking_System.Travel_Booking_System.Services;

import com.Travel_Booking_System.Travel_Booking_System.Models.Car_Rental;
import com.Travel_Booking_System.Travel_Booking_System.Repositories.Car_Rental_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Car_Rental_Service {
    @Autowired
    Car_Rental_Repository car_rental_repository;
    public List<Car_Rental> getAllCar_Rentals() {

        return car_rental_repository.findAll();
    }

    public Car_Rental getCar_RentalById(Long id) {

        return car_rental_repository.findById(id).get();
    }
}
