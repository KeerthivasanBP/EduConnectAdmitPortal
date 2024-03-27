package com.pramoth.college_admission_portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pramoth.college_admission_portal.model.Schoolinformation;
import com.pramoth.college_admission_portal.repository.SchoolInformationRepo;

@Service
public class SchoolInformationService {
    @Autowired
    private SchoolInformationRepo schoolInformationRepo;

    public ResponseEntity<List<Schoolinformation>> getAllSchoolInformation() {
        List<Schoolinformation> school1 = schoolInformationRepo.findAll();
        return ResponseEntity.ok(school1);
    }

    public ResponseEntity<Schoolinformation> postSchool(Schoolinformation sc) {
        Schoolinformation school2 = schoolInformationRepo.save(sc);
        return ResponseEntity.ok(school2);
    }

    public ResponseEntity<Schoolinformation> getSchoolById(String hid, Schoolinformation school) {
        Schoolinformation school3 = schoolInformationRepo.findById(hid).get();
        return ResponseEntity.ok(school3);
    }

    public ResponseEntity<String> deleteSchool(String hid) {
        schoolInformationRepo.deleteById(hid);
        return ResponseEntity.ok("School Information deleted successfully");
    }

    public ResponseEntity<Schoolinformation> updateSchool(Schoolinformation schoolinformation, String hid) {
        Schoolinformation school = schoolInformationRepo.findById(hid).get();
        school.setEleventhpercentage(schoolinformation.getEleventhpercentage());
        school.setEleventhmarksheet(schoolinformation.getEleventhmarksheet());
        school.setEleventhschool(schoolinformation.getEleventhschool());
        school.setEleventhmarksheet(schoolinformation.getEleventhmarksheet());
        school.setEleventhpercentage(schoolinformation.getEleventhpercentage());
        school.setTwelvethschool(schoolinformation.getTwelvethschool());
        school.setTenthmarksheet(schoolinformation.getTenthmarksheet());
        school.setSchool(schoolinformation.getSchool());
        school.setTenthschool(schoolinformation.getTenthschool());
        school.setTenthpercentage(schoolinformation.getTenthpercentage());
        school.setNinethschool(schoolinformation.getNinethschool());
        Schoolinformation schoolinformation2 = schoolInformationRepo.save(school);
        return ResponseEntity.ok(schoolinformation2);
    }
}
