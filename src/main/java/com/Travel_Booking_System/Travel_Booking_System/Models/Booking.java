package com.Travel_Booking_System.Travel_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long booking_id;
    String date;
    Double price;
    String confirmation_number;

    // many-to-one with customers, hotels, flights, and car rentals;
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

    // one-to-one with cancellations
    @OneToOne
    @JoinColumn(name = "cancellation_id", referencedColumnName = "cancellation_id")
    Cancellation cancellation;
}
