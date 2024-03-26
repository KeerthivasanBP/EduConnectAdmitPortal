package com.pramoth.college_admission_portal.model;

import org.springframework.http.ResponseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "school_details")
public class Schoolinformation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String hid;
    private String school;
    private String ninethschool;
    private String tenthschool;
    private String tenthmarksheet;
    private String eleventhschool;
    private String eleventhmarksheet;
    private String twelvethschool;
    private String twelvethmarksheet;
    private String tenthpercentage;
    private String eleventhpercentage;
    private String twelvethpercentage;
}
