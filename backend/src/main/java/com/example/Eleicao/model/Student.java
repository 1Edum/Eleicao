package com.example.Eleicao.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Student extends Person {
    private boolean isCandidate;
    // Corrigido para usar o parâmetro 'hasVoted'
    @Setter
    private boolean hasVoted;
    @Setter
    @Getter
    private String studentClass;

    // Getters and setters
    public boolean isCandidate() {
        return isCandidate;
    }

    public void setCandidate(boolean candidate) {
        this.isCandidate = candidate; // Corrigido para usar o parâmetro 'candidate'
    }

    public boolean hasVoted() {
        return hasVoted;
    }

}

