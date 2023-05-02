package com.service;

import com.entity.Student10;
import com.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentServiceInter{

    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student10> getAll() {
        List<Student10> list=studentRepo.findAll();
        return list;
    }

    @Override
    public Student10 save(Student10 student) {
        Student10 student1=studentRepo.save(student);
        return student1;
    }
}
