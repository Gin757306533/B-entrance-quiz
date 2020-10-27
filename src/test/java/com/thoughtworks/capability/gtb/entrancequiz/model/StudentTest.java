package com.thoughtworks.capability.gtb.entrancequiz.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void should_create_student_successful(){
        Student student = new Student(1, "abc");
        assertEquals(student.getId(), 1);
        assertEquals(student.getName(), "abc");
    }
}
