package com.Travel_Booking_System.Travel_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customer_id;
    String name;
    Integer phone_number;
    String address;
    String payment_information;

}
