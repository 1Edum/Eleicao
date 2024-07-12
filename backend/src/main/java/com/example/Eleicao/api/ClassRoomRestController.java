package com.example.Eleicao.api;

import com.example.Eleicao.model.ClassRoom;
import com.example.Eleicao.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classrooms")
public class ClassRoomRestController {
    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public List<ClassRoom> getAllClassrooms() {
        return classroomService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassRoom> getClassroomById(@PathVariable Long id) {
        Optional<ClassRoom> classroom = classroomService.findById(id);
        return classroom.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ClassRoom createClassroom(@RequestBody ClassRoom classroom) {
        return classroomService.save(classroom);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClassRoom> updateClassroom(@PathVariable Long id, @RequestBody ClassRoom classroomDetails) {
        Optional<ClassRoom> classroom = classroomService.findById(id);
        if (classroom.isPresent()) {
            ClassRoom existingClassroom = classroom.get();
            existingClassroom.setName(classroomDetails.getName());
            ClassRoom updatedClassroom = classroomService.save(existingClassroom);
            return ResponseEntity.ok(updatedClassroom);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClassroom(@PathVariable Long id) {
        Optional<ClassRoom> classroom = classroomService.findById(id);
        if (classroom.isPresent()) {
            classroomService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
