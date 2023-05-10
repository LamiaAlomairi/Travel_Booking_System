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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customer_id;
    String name;
    Integer phone_number;
    String address;
    String payment_information;

    //one-to-many with bookings, reviews, and ratings
    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Booking> bookings;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Review> reviews;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Rating> ratings;

    @ManyToOne
    @JoinColumn(name = "payment_method_id", referencedColumnName = "payment_method_id")
    Payment_Method payment_method;

}
