package com.thoughtworks.capability.gtb.entrancequiz.model.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;

import java.util.List;

public class StudentsResponse {
    private List<Student> students;

    public StudentsResponse(List<Student> students) { this.students = students; }
}
