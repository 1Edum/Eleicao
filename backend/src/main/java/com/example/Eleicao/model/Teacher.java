package com.example.Eleicao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher extends Person {
    @Id
    private Long id;
    private String name;

    // Getters and setters
}
