package com.pramoth.college_admission_portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pramoth.college_admission_portal.model.Courses;
import com.pramoth.college_admission_portal.repository.CourseRepository;
@Service
public class CoursesService {
    @Autowired
    private CourseRepository courseRepository;

    public ResponseEntity<Courses> getCourseById(String courseid) {
        Courses c1 = courseRepository.findById(courseid).get();
        return ResponseEntity.ok(c1);
    }

    public ResponseEntity<List<Courses>> getAllCourses() {
        List<Courses> c2=courseRepository.findAll();
        return ResponseEntity.ok(c2);
    }

    public ResponseEntity<Courses> postCourses(Courses course) {
        Courses c3 = courseRepository.save(course);
        return ResponseEntity.ok(c3);
    }

    public ResponseEntity<Courses> updateCourse(Courses c1, String courseid) {
        Courses c4 = courseRepository.findById(courseid).get();
        c4.setCoursename(c1.getCoursename());
        c4.setDepartment(c1.getDepartment());
        Courses c5 = courseRepository.save(c4);
        return ResponseEntity.ok(c5);
    }

    public ResponseEntity<String> deleteCourse(String courseid) {
        courseRepository.deleteById(courseid);
        return ResponseEntity.ok("Deleted Successfully");
    }

    
}
