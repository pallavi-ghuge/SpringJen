package com.controller;

import com.entity.Course10;
import com.service.CourseServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Course")
@RestController
public class CourseController {
    @Autowired
    CourseServiceInter courseServiceInter;

    @GetMapping("/test")
    @ResponseBody
    public  String test(){
        return  "in course controller";
    }

    @GetMapping("/getAll")
    List<Course10> getAll(){
        List<Course10> list=courseServiceInter.getAll();
        return list;
    }

    /*@PostMapping("/addCourse")
    Course10 addCourse(@RequestBody Course10 course){
        Course10 course1=courseServiceInter.save(course);
        return course1;

    }*/

}
