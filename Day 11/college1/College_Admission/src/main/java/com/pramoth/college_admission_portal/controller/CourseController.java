package com.pramoth.college_admission_portal.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pramoth.college_admission_portal.constant.Api;
import com.pramoth.college_admission_portal.model.Courses;
import com.pramoth.college_admission_portal.service.impl.CoursesService;

@RequestMapping(Api.ADMIN)
@RestController
public class CourseController {
    @Autowired
    private CoursesService coursesService;
    @GetMapping("/getCourse")
    public ResponseEntity<Courses> getCourseById(@RequestParam String courseid){
        return coursesService.getCourseById(courseid);
    }
    @GetMapping("getAllCourses")
    public ResponseEntity<List<Courses>> getAllCourses(){
        return coursesService.getAllCourses();
    }
    @PostMapping("/postCourse")
    public ResponseEntity<Courses> postCourses(@RequestBody Courses course){
        return coursesService.postCourses(course);
    }
    @PutMapping("/updateCourse")
    public ResponseEntity<Courses> updateCourse(@RequestBody Courses c1,@RequestParam String courseid){
        return coursesService.updateCourse(c1,courseid);
    }
    @DeleteMapping("/deleteCourse")
    public ResponseEntity<String> deleteCourse(@RequestParam String courseid){
             return coursesService.deleteCourse(courseid);
    }

}
