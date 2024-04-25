package com.example.gticslab420200814.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="departments")
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer department_id;
    @Column
    private String department_name;
    @ManyToOne
    @JoinColumn(name="manager_id")
    private Employees manager_id;
    @ManyToOne
    @JoinColumn(name="location_id")
    private Locations location_id;

}

