package com.VacancyPool.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;

import lombok.Getter;

@Getter
@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;
    @NotEmpty
    private String name;
    @Column(unique = true)
    private String rg;
    @NotNull
    private String email;
    @ManyToOne
    private Vacancy vacancy;

}
