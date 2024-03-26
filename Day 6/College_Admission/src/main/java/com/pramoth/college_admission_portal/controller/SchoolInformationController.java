package com.pramoth.college_admission_portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pramoth.college_admission_portal.constant.Api;
import com.pramoth.college_admission_portal.model.Schoolinformation;
import com.pramoth.college_admission_portal.repository.SchoolInformationRepo;
import com.pramoth.college_admission_portal.service.impl.SchoolInformationService;

@RestController
@RequestMapping(Api.ADMIN)
@CrossOrigin(value = "*")
public class SchoolInformationController {
    @Autowired
    private SchoolInformationService schoolInformationService;
    @GetMapping("/getAllSchool")
    public ResponseEntity<List<Schoolinformation>> getAllSchoolInformation(){
        return schoolInformationService.getAllSchoolInformation();
    }
    @PostMapping("/postSchool")
    public ResponseEntity<Schoolinformation> postSchool(@RequestBody Schoolinformation sc){
        return schoolInformationService.postSchool(sc);
    }
    @GetMapping("/getSchool")
    public ResponseEntity<Schoolinformation> getSchoolById(@RequestParam String hid,@RequestBody Schoolinformation school){
        return schoolInformationService.getSchoolById(hid,school);
    }
    @PutMapping("/updateSchool")
    public ResponseEntity<Schoolinformation> updateSchool(@RequestBody Schoolinformation schoolinformation, @RequestParam String hid){
        return schoolInformationService.updateSchool(schoolinformation,hid);
    }
    @DeleteMapping("/deleteSchool")
    public ResponseEntity<String> deleteSchool(@RequestParam String hid){
        return schoolInformationService.deleteSchool(hid);
    }
    



    
}
