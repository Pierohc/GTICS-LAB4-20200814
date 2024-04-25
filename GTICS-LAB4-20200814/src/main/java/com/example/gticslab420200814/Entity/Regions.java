package com.example.gticslab420200814.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="regions")
public class Regions {

    @Id
    private Integer region_id;
    @Column
    private String region_name;

}
