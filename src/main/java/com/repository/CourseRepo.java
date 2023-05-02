package com.repository;

import com.entity.Course10;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course10,Integer> {
    @Override
    List<Course10> findAll();
}
