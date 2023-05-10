package com.Travel_Booking_System.Travel_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "cancellation")
public class Cancellation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long cancellation_id;
    String date;
    String reason;

    @OneToOne
    @JoinColumn(name = "booking_id", referencedColumnName = "booking_id")
    Booking booking;
}
