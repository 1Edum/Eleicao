package com.example.Eleicao.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Eleicao.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
