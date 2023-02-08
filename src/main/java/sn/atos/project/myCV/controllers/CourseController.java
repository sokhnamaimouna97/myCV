package sn.atos.project.myCV.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.atos.project.myCV.entities.Course;
import sn.atos.project.myCV.services.CourseService;

import java.util.LinkedList;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/cv")
public class CourseController {
    @Autowired
    private CourseService  courseService;

    @GetMapping("/allCourse")
    public ResponseEntity<List<Course>> getAll() {
        List<Course> course = null;
        try{
            course = this.courseService.getAll();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Course>>(course, HttpStatus.OK);
    }
    @PostMapping("/saveCourse")
    public ResponseEntity <Course> addCourse(@RequestBody Course course){
        boolean c = false;
        try{
            c = this.courseService.saveCourse(course);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }
}
