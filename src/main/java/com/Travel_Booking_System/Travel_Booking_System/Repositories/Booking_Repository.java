package com.Travel_Booking_System.Travel_Booking_System.Repositories;

import com.Travel_Booking_System.Travel_Booking_System.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Booking_Repository extends JpaRepository<Booking, Long> {
}
