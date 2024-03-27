package com.pramoth.college_admission_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pramoth.college_admission_portal.constant.Api;
import com.pramoth.college_admission_portal.dto.response.StudentdetailResponse;
import com.pramoth.college_admission_portal.model.Studentdetail;
import com.pramoth.college_admission_portal.repository.StudentdetailRepo;
import com.pramoth.college_admission_portal.service.impl.StudentdetailService;

import java.util.List;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping(Api.ADMIN)
@RequiredArgsConstructor
@CrossOrigin("*")
public class StudentDetailController {
        @Autowired
      private  StudentdetailService studentService;

    @GetMapping("/getAllStudent")
    public ResponseEntity<List<Studentdetail>> getAllStudents(){
         List<Studentdetail> student = studentService.getAllStudents();
         return   ResponseEntity.ok(student);
    }
    @GetMapping("/hi")
    public String get(){
        return "hiii";
    }
    @GetMapping("/get")
    public ResponseEntity<Studentdetail> getStudent(@RequestParam String sdid){
        Studentdetail st = studentService.getStudent(sdid);
        return ResponseEntity.ok(st);
    }
    @PostMapping("/postStudent")
    public ResponseEntity<Studentdetail> post(@RequestBody Studentdetail student){  

        Studentdetail studentdetail=studentService.postStudent(student);
        System.out.println(student);
        return ResponseEntity.ok(studentdetail);
    }
    @PutMapping("/updateStudent")
    public ResponseEntity<String> updateStudent(@RequestBody Studentdetail st2,@RequestParam String sdid){
        boolean student = studentService.updateStudent(st2,sdid);
        if(student)
        return ResponseEntity.ok("Updated Successfully");
        else
        return ResponseEntity.ok("Unsuccessful");
    }
    @DeleteMapping("/deleteStudent")
    public ResponseEntity<String> delete(@RequestParam String sdid){
           boolean stud = studentService.deleteStudent(sdid);
           return stud ? ResponseEntity.ok("Successfully deleted student"):null;
    }

    
}
