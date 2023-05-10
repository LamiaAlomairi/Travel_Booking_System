package com.Travel_Booking_System.Travel_Booking_System.Services;

import com.Travel_Booking_System.Travel_Booking_System.Models.Customer;
import com.Travel_Booking_System.Travel_Booking_System.Repositories.Customer_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Customer_Service {
    @Autowired
    Customer_Repository customer_repository;
    public List<Customer> getAllCustomers() {

        return customer_repository.findAll();
    }

    public Customer getCustomerById(Long id) {

        return customer_repository.findById(id).get();
    }
}
