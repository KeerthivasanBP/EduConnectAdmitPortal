package com.pramoth.college_admission_portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contact_details")
public class Contactdetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String cid;
    private String cname;
    private String cphonenumber;
    private String cemail;
    private String caddress;
    private String guardianname;
    private String guardianemail;
    private String guardiannumber;
    private String guardianaddress;
    
}
