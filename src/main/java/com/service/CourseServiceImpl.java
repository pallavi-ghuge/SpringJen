package com.service;

import com.entity.Course10;
import com.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseServiceInter{

    @Autowired
    CourseRepo courseRepo;
    @Override
    public List<Course10> getAll() {
        List<Course10> list=courseRepo.findAll();
        return list;
    }

    @Override
    public Course10 save(Course10 course) {
        Course10 course1=courseRepo.save(course);
        return course1;
    }
}
