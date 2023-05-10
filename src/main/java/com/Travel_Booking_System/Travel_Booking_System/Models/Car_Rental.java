package com.Travel_Booking_System.Travel_Booking_System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    //one-to-many with bookings, reviews, and ratings
    @OneToMany(mappedBy = "car_rental")
    @JsonIgnore
    private List<Booking> bookings;

    @OneToMany(mappedBy = "car_rental")
    @JsonIgnore
    private List<Review> reviews;

    @OneToMany(mappedBy = "car_rental")
    @JsonIgnore
    private List<Rating> ratings;
}
