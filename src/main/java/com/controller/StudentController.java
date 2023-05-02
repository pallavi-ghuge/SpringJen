package com.controller;

import com.entity.Student10;
import com.service.StudentServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Student")
@RestController
public class StudentController {

    @Autowired
    StudentServiceInter studentServiceInter;
    @GetMapping("/test")
    public  String test(){
        return  "in student controller";
    }

    @GetMapping("/getAll")
    List<Student10> getAll(){
        List<Student10> students=studentServiceInter.getAll();
        return students;
    }

    /*@PostMapping("/addStudent")
    Student10 addCourse(@RequestBody Student10 student){
        Student10 student1=studentServiceInter.save(student);
        return student1;
    }*/

}
