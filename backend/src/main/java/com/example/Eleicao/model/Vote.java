package com.example.Eleicao.model;

import jakarta.persistence.*;

@Entity
public class Vote extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "voter_id")
    private Person voter;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Person candidate;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private ClassRoom classroom;

    // Default constructor
    public Vote() {}

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getVoter() {
        return voter;
    }

    public void setVoter(Person voter) {
        this.voter = voter;
    }

    public Person getCandidate() {
        return candidate;
    }

    public void setCandidate(Person candidate) {
        this.candidate = candidate;
    }

    public ClassRoom getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassRoom classroom) {
        this.classroom = classroom;
    }
}
