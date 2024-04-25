package com.example.gticslab420200814.Entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="job_history")
public class Job_history {

    @Id
    @Column(name="job_history_id")
    private Integer job_history_id;

    @Id
    @Column(name="start_date")
    private Date start_date;


    @EmbeddedId
    private Job_history_id id;

    @MapsId("employee_id")
    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employees employee_id;


    @Column
    private LocalDate end_date;
    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job_id;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Departments department_id;

}
