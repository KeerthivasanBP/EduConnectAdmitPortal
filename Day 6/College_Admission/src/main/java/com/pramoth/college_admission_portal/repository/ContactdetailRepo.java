package com.pramoth.college_admission_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pramoth.college_admission_portal.model.Contactdetails;

public interface ContactdetailRepo extends JpaRepository<Contactdetails,String>{
    
}
