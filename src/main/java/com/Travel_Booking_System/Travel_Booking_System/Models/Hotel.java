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
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long hotel_id;
    String name;
    String address;
    Integer rating;
    String room_types;
    String amenities;
    boolean availability;

    //one-to-many with bookings, reviews, and ratings
    @OneToMany(mappedBy = "hotel")
    @JsonIgnore
    private List<Booking> bookings;

    @OneToMany(mappedBy = "hotel")
    @JsonIgnore
    private List<Review> reviews;

    @OneToMany(mappedBy = "hotel")
    @JsonIgnore
    private List<Rating> ratings;
}
