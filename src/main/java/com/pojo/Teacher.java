package com.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private Integer tid;
    private String name;

    public Teacher() {
    }

    public Teacher(Integer tid, String name) {
        this.tid = tid;
        this.name = name;
    }
}
