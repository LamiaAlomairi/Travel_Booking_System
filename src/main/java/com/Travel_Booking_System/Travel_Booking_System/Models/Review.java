package com.Travel_Booking_System.Travel_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long review_id;
    String rating;
    String comments;

    // many-to-one with customers, hotels, flights, and car rentals
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "hotel_id", referencedColumnName = "hotel_id")
    Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "flight_id", referencedColumnName = "flight_id")
    Flight flight;

    @ManyToOne
    @JoinColumn(name = "car_rental_id", referencedColumnName = "car_rental_id")
    Car_Rental car_rental;
}
