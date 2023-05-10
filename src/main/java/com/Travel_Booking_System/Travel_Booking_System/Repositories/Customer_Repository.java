package com.Travel_Booking_System.Travel_Booking_System.Repositories;

import com.Travel_Booking_System.Travel_Booking_System.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_Repository extends JpaRepository<Customer, Long> {
}
