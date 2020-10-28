package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.model.dto.StudentsResponse;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// TODO GTB-工程实践: - 直接命名为StudentController即可
public class StudentInfoController {

    // TODO GTB-知识点: - 构造注入的字段推荐使用final
    private StudentService studentService;

    public StudentInfoController(StudentService studentService){this.studentService = studentService;}

    // TODO GTB-知识点: - 了解下@GetMapping
    @RequestMapping(value = "/students")
    // TODO GTB-知识点: - 违反Restful实践，请求成功后直接返回数据即可，不需要再包一层
    public ResponseEntity<StudentsResponse> getAllStudents(){
        List<Student> students = studentService.getAllStudents();
        StudentsResponse studentsResponse = new StudentsResponse(students);
        return ResponseEntity.ok(studentsResponse);
    }
}
