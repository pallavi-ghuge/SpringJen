package com.repository;

import com.entity.Student10;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student10,Integer> {
    @Override
    List<Student10> findAll();
}
