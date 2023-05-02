package com.service;

import com.entity.Student10;

import java.util.List;

public interface StudentServiceInter {
    List<Student10> getAll();
    Student10 save(Student10 student);
}
