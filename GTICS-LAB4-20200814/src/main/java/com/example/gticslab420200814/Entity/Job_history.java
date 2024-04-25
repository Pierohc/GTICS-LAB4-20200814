package com.example.gticslab420200814.Entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="job_history")
public class Job_history {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer job_history;
    
    @EmbeddedId
    private Job_history_id id_employee;

    @Column
    private LocalDate start_date;
    @Column
    private LocalDate end_date;
    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job_id;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Departments department_id;

}
