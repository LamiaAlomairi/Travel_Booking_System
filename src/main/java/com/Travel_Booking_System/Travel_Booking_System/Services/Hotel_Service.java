package com.Travel_Booking_System.Travel_Booking_System.Services;

import com.Travel_Booking_System.Travel_Booking_System.Models.Hotel;
import com.Travel_Booking_System.Travel_Booking_System.Repositories.Hotel_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Hotel_Service {
    @Autowired
    Hotel_Repository hotel_repository;
    public List<Hotel> getAllHotels() {

        return hotel_repository.findAll();
    }

    public Hotel getHotelById(Long id) {

        return hotel_repository.findById(id).get();
    }
}
