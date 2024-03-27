package com.pramoth.college_admission_portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramoth.college_admission_portal.dto.request.StudentRequest;
import com.pramoth.college_admission_portal.dto.response.StudentdetailResponse;
import com.pramoth.college_admission_portal.model.Courses;
import com.pramoth.college_admission_portal.model.Schoolinformation;
import com.pramoth.college_admission_portal.model.Studentdetail;
import com.pramoth.college_admission_portal.model.enumerate.Role;
import com.pramoth.college_admission_portal.repository.ContactdetailRepo;
import com.pramoth.college_admission_portal.repository.SchoolInformationRepo;
import com.pramoth.college_admission_portal.repository.StudentdetailRepo;

import java.util.Optional;
import java.util.List;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
@Service
public class StudentdetailService {
    @Autowired
    private  StudentdetailRepo studentdetailRepo;

    @Autowired 
    private SchoolInformationRepo sr;
    private ContactdetailRepo cr;
    private Courses cour;



    public List<Studentdetail> getAllStudents() {
         return studentdetailRepo.findAll();
    }
    public Studentdetail postStudent(Studentdetail student) {

        // Schoolinformation shi = student.getSchoolinformation();
        // sr.save(shi);
        return studentdetailRepo.save(student);   
    }
    public boolean deleteStudent(String sdid) {

        studentdetailRepo.deleteById(sdid);
        return true;
         
    }
    public Studentdetail getStudent(String sdid) {
        return studentdetailRepo.findById(sdid).get();
    }
    public boolean updateStudent(Studentdetail st2, String sdid) {
        Studentdetail st1 = studentdetailRepo.findById(sdid).get();
        if(st1!=null){
        st1.setAge(st2.getAge());
        st1.setCaste(st2.getCaste());
        st1.setContactdetails(st2.getContactdetails());
        st1.setCourses(st2.getCourses());
        st1.setDateofbirth(st2.getDateofbirth());
        st1.setEmail(st2.getEmail());
        st1.setFirstName(st2.getFirstName());
        st1.setImage(st2.getImage());
        st1.setGender(st2.getGender());
        st1.setLastName(st2.getLastName());
        st1.setNationality(st2.getNationality());
        st1.setPhonenumber(st2.getPhonenumber());
        st1.setReligion(st2.getReligion());
        st1.setSchoolinformation(st2.getSchoolinformation());
        st1.setState(st2.getState());
        st1.setRole(st2.getRole());
        studentdetailRepo.save(st1);
        return true;
        }
        else 
        return false;
    }

    
}
