package com.example.gticslab420200814.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Embeddable
public class Job_history_id implements Serializable {

    @Column(name="employee_id")
    private Integer employee_id;


}
