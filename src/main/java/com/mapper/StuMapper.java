package com.mapper;

import com.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StuMapper {

    public List<Student> selStudents();

    public Student selectById(int id);

    public int addStu(Student student);

    public int updateStu(Student student);

    public int deleteStu(int id);

}
