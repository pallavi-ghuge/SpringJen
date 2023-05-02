package com.service;

import com.entity.Course10;

import java.util.List;

public interface CourseServiceInter {
    List<Course10> getAll();

    Course10 save(Course10 course);
}
