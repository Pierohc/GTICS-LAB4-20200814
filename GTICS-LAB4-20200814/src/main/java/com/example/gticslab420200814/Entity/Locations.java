package com.example.gticslab420200814.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locations")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer location_id;
    @Column
    private String street_address;
    @Column
    private String postal_code;
    @Column
    private String city;
    @Column
    private String state_province;
    @ManyToOne
    @JoinColumn(name="country_id")
    private Countries country_id;

}

