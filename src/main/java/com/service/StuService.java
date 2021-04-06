package com.service;

import com.mapper.StuMapper;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService {
    @Autowired
    StuMapper stuMapper;

    public List<Student> selStudents(){
        List<Student> students = stuMapper.selStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }
}
