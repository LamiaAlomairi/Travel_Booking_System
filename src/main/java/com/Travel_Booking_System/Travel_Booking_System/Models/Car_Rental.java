package com.Travel_Booking_System.Travel_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "car_rental")
public class Car_Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long car_rental_id;
    Integer car_model;
    String rental_agency;
    String pickup_location;
    String return_location;
    String rental_period;
    Double price;
    boolean availability;
    
}
