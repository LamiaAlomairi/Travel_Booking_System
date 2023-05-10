package com.Travel_Booking_System.Travel_Booking_System.Services;

import com.Travel_Booking_System.Travel_Booking_System.Models.Flight;
import com.Travel_Booking_System.Travel_Booking_System.Repositories.Flight_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Flight_Service {
    @Autowired
    Flight_repository flight_repository;
    public List<Flight> getAllFlights() {

        return flight_repository.findAll();
    }

    public Flight getFlightById(Long id) {

        return flight_repository.findById(id).get();
    }
}
