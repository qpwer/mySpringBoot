package com.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer sid;
    private String sname;
    private Teacher teacher;

    public Student(Integer sid, String sname, Teacher teacher) {
        this.sid = sid;
        this.sname = sname;
        this.teacher = teacher;
    }

    public Student() {
    }
}
