package com.pramoth.college_admission_portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pramoth.college_admission_portal.constant.Api;
import com.pramoth.college_admission_portal.model.Contactdetails;
import com.pramoth.college_admission_portal.service.impl.ContactdetailsService;
@RequestMapping(Api.ADMIN)
@RestController
public class ContactdetailsController {
    @Autowired
    private ContactdetailsService contactdetailsService;
    @GetMapping("/getAllContact")
    public ResponseEntity<List<Contactdetails>> getAllContacts(){
        return contactdetailsService.getAllContacts();
    } 
    @GetMapping("/getContact")
    public ResponseEntity<Contactdetails> getContacts(@RequestParam String cid){
          return contactdetailsService.getContacts(cid);
    }
    @PostMapping("/postContact")
    public ResponseEntity<Contactdetails> postContact(@RequestBody Contactdetails contactdetails){
        return contactdetailsService.postContact(contactdetails);
    }
    @PutMapping("/updateContact")
    public ResponseEntity<Contactdetails> updateContact(@RequestBody Contactdetails contactdetails1,@RequestParam String cid){
        return contactdetailsService.updateContact(contactdetails1,cid);
    }
    @DeleteMapping("/deleteContact")
    public ResponseEntity<String> deleteContact(@RequestParam String cid){
        return contactdetailsService.deleteContact(cid);
    }
    
}
