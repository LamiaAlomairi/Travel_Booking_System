package com.Travel_Booking_System.Travel_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long flight_id;
    String airline;
    String departure_city;
    String arrival_city;
    String departure_time;
    String arrival_time;
    Integer duration;
    Double price;
    boolean availability;

}
