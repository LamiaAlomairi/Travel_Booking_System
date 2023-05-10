package com.Travel_Booking_System.Travel_Booking_System.Controllers;

import com.Travel_Booking_System.Travel_Booking_System.Models.Payment_Method;
import com.Travel_Booking_System.Travel_Booking_System.Services.Payment_Method_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "payment_method")
public class Payment_Method_Controller {
    //    http://localhost:8080/payment_method/getAll
    @Autowired
    Payment_Method_Service payment_method_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Payment_Method> getAllPayment_Methods() {

        return payment_method_service.getAllPayment_Methods();
    }
    @GetMapping(value = "getById")
    public Payment_Method getPayment_MethodById(@RequestParam Long id) {

        return payment_method_service.getPayment_MethodById(id);
    }
}
