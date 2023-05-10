package com.Travel_Booking_System.Travel_Booking_System.Services;

import com.Travel_Booking_System.Travel_Booking_System.Models.Payment_Method;
import com.Travel_Booking_System.Travel_Booking_System.Repositories.Payment_Method_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Payment_Method_Service {
    @Autowired
    Payment_Method_Repository payment_method_repository;
    public List<Payment_Method> getAllPayment_Methods() {

        return payment_method_repository.findAll();
    }

    public Payment_Method getPayment_MethodById(Long id) {

        return payment_method_repository.findById(id).get();
    }
}
