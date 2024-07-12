package com.example.Eleicao.service;

import com.example.Eleicao.model.Teacher;
import com.example.Eleicao.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> findById(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher save(Teacher professor) {
        return teacherRepository.save(professor);
    }

    public void deleteById(Long id) {
        teacherRepository.deleteById(id);
    }
}
