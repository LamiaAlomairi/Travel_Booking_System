package com.Travel_Booking_System.Travel_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "payment_method")
public class Payment_Method {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long payment_method_id;
    String name;
    Integer card_number;
    String expiration_date;
    String security_code;

}
