package com.example.Eleicao.repository;

import com.example.Eleicao.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
