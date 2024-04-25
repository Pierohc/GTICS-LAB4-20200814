package com.example.gticslab420200814.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="countries")
public class Countries {

    @Id
    private Integer country_id;
    @Column
    private String country_name;
    @Column
    private Float region_id;

}

