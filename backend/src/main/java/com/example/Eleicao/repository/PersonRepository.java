package com.example.Eleicao.repository;

import com.example.Eleicao.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
