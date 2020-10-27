package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.model.dto.StudentsResponse;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentInfoController {

    private StudentService studentService;

    public StudentInfoController(StudentService studentService){this.studentService = studentService;}

    @RequestMapping(value = "/students")
    public ResponseEntity<StudentsResponse> getAllStudents(){
        List<Student> students = studentService.getAllStudents();
        StudentsResponse studentsResponse = new StudentsResponse(students);
        return ResponseEntity.ok(studentsResponse);
    }
}
