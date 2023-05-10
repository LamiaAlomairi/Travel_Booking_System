package com.Travel_Booking_System.Travel_Booking_System.Services;

import com.Travel_Booking_System.Travel_Booking_System.Models.Booking;
import com.Travel_Booking_System.Travel_Booking_System.Repositories.Booking_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Booking_Service {
    @Autowired
    Booking_Repository booking_repository;
    public List<Booking> getAllBookings() {

        return booking_repository.findAll();
    }

    public Booking getBookingById(Long id) {

        return booking_repository.findById(id).get();
    }
}
