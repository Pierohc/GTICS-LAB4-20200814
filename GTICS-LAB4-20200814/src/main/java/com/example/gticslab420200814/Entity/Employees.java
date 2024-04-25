package com.example.gticslab420200814.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import org.hibernate.mapping.Join;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String phone_number;
    @Column
    private LocalDate hire_date;
    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job_id;
    @Column
    private Float salary;
    @Column
    private Float commission_pct;
    @Column
    private Integer manager_id;
    @Column
    private Integer department_id;
    @Column
    private Integer enabled;




}
