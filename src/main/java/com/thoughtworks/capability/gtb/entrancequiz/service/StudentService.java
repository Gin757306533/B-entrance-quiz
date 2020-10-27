package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.mapper.StudentMapper;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper){this.studentMapper=studentMapper;};

    public List<Student> getAllStudents(){return studentMapper.getAllStudents();}

}
