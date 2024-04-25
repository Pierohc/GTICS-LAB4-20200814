package com.example.gticslab420200814.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="jobs")
public class Job {
    @Id
    private Integer job_id;
    @Column
    private String job_title;
    @Column
    private Integer min_salary;
    @Column
    private Integer max_salary;

}
