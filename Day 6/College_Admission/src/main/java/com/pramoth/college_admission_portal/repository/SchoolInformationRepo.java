package com.pramoth.college_admission_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pramoth.college_admission_portal.model.Schoolinformation;

public interface SchoolInformationRepo extends JpaRepository<Schoolinformation,String> {
    
}
