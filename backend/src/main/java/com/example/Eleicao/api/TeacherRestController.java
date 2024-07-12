package com.example.Eleicao.api;

import com.example.Eleicao.model.Teacher;
import com.example.Eleicao.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teachers")
public class TeacherRestController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> findAll() {
        return teacherService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Teacher> findById(@PathVariable Long id) {
        return teacherService.findById(id);
    }

    @PostMapping
    public Teacher save(@RequestBody Teacher professor) {
        return teacherService.save(professor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        teacherService.deleteById(id);
    }
}
