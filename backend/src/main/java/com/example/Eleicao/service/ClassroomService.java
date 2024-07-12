package com.example.Eleicao.service;


import com.example.Eleicao.model.ClassRoom;
import com.example.Eleicao.repository.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {
    @Autowired
    private ClassRoomRepository classroomRepository;

    public List<ClassRoom> findAll() {
        return classroomRepository.findAll();
    }

    public Optional<ClassRoom> findById(Long id) {
        return classroomRepository.findById(id);
    }

    public ClassRoom save(ClassRoom classRoom) {
        return classroomRepository.save(classRoom);
    }

    public void deleteById(Long id) {
        classroomRepository.deleteById(id);
    }

}
