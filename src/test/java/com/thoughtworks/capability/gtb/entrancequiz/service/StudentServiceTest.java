package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.mapper.StudentMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class StudentServiceTest {
    @Mock
    StudentMapper studentMapper;

    private StudentService studentService;

    @BeforeEach
    void setUp(){
        initMocks(this);
        studentService = new StudentService(studentMapper);
    }

    @Test
    void shouldGetAllStudents(){
        studentService.getAllStudents();

        verify(studentMapper).getAllStudents();
    }
}
