package com.thoughtworks.capability.gtb.entrancequiz.mapper;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentMapper {

    public List<Student> getAllStudents(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "成吉思汗"));
        studentList.add(new Student(2, "鲁班七号"));
        studentList.add(new Student(3, "太乙真人"));
        studentList.add(new Student(4, "钟无艳"));
        studentList.add(new Student(5, "花木兰"));
        studentList.add(new Student(6, "雅典娜"));
        studentList.add(new Student(7, "芈月"));
        studentList.add(new Student(8, "白起"));
        studentList.add(new Student(9, "刘禅"));
        studentList.add(new Student(10, "庄周"));
        studentList.add(new Student(11, "马超"));
        studentList.add(new Student(12, "刘备"));
        studentList.add(new Student(13, "哪吒"));
        studentList.add(new Student(14, "大乔"));
        studentList.add(new Student(15, "蔡文姬"));
        return studentList;
    }


}
