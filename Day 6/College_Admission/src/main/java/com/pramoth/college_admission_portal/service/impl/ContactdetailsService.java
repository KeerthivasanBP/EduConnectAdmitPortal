package com.pramoth.college_admission_portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pramoth.college_admission_portal.model.Contactdetails;
import com.pramoth.college_admission_portal.repository.ContactdetailRepo;
@Service
public class ContactdetailsService {
    @Autowired
    private ContactdetailRepo contactdetailRepo;

    public ResponseEntity<List<Contactdetails>> getAllContacts() {
        List<Contactdetails> contact1 = contactdetailRepo.findAll();
        return ResponseEntity.ok(contact1);
    }

    public ResponseEntity<Contactdetails> getContacts(String cid) {
        Contactdetails contact2 = contactdetailRepo.findById(cid).get();
        return ResponseEntity.ok(contact2);
    }

    public ResponseEntity<Contactdetails> postContact(Contactdetails contactdetails) {
        Contactdetails contact3 = contactdetailRepo.save(contactdetails);
        return ResponseEntity.ok(contact3);
    }

    public ResponseEntity<Contactdetails> updateContact(Contactdetails contactdetails1, String cid) {
        Contactdetails contact4 = contactdetailRepo.findById(cid).get();
        contact4.setCaddress(contactdetails1.getCaddress());
        contact4.setCemail(contactdetails1.getCemail());
        contact4.setGuardianaddress(contactdetails1.getGuardianaddress());
        contact4.setGuardianemail(contactdetails1.getGuardianemail());
        contact4.setGuardianname(contactdetails1.getGuardianname());
        contact4.setGuardiannumber(contactdetails1.getGuardiannumber());
        contact4.setCname(contactdetails1.getCname());
        contact4.setCphonenumber(contactdetails1.getCphonenumber());
        contactdetailRepo.save(contact4);
        return ResponseEntity.ok(contact4);
    }

    public ResponseEntity<String> deleteContact(String cid) {
        return null;
    }
}
