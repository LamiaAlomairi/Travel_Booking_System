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
@Table(name = "payment_method")
public class Payment_Method {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long payment_method_id;
    String name;
    Integer card_number;
    String expiration_date;
    String security_code;

    @OneToMany(mappedBy = "payment_method")
    @JsonIgnore
    private List<Customer> customers;
}
