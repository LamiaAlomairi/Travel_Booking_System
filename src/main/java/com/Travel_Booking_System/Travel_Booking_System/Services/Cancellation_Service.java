package com.Travel_Booking_System.Travel_Booking_System.Services;

import com.Travel_Booking_System.Travel_Booking_System.Models.Cancellation;
import com.Travel_Booking_System.Travel_Booking_System.Repositories.Cancellation_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cancellation_Service {
    @Autowired
    Cancellation_Repository cancellation_repository;
    public List<Cancellation> getAllCancellations() {

        return cancellation_repository.findAll();
    }

    public Cancellation getCancellationById(Long id) {

        return cancellation_repository.findById(id).get();
    }
}
