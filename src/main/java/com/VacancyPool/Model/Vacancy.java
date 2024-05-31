package com.VacancyPool.Model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
@Getter
@Entity
public class Vacancy implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;
    @NotEmpty
    @NotNull
    private String name;
    @NotEmpty
    @NotNull
    private String description;
    @NotEmpty
    @NotNull
    private float salary;
   
    @OneToMany(mappedBy = "job", cascade = CascadeType.REMOVE)
    private List<Candidate> candidates;


}
