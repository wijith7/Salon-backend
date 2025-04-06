package com.wijith.modal;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;
import java.security.PrivateKey;

@Entity
@Data
public class Salon {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;

    @ElementCollection
    private List<String> images;
    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phonenumber;
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private Long ownerId;

    @Column(nullable = false)
    private LocalTime openTime;
    @Column(nullable = false)
    private LocalTime closeTime;


}
