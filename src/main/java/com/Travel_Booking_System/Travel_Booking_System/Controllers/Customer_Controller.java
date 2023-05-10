package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Customer;
import com.Travel_Booking_System.Travel_Booking_System.Services.Customer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "customer")
public class Customer_Controller {
    //    http://localhost:8080/customer/getAll
    @Autowired
    Customer_Service customer_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customer_service.getAllCustomers();
    }
    @GetMapping(value = "getById")
    public Customer getCustomerById(@RequestParam Long id) {

        return customer_service.getCustomerById(id);
    }
}
