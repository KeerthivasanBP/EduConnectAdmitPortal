package eduadmit.eduadmit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import eduadmit.eduadmit.service.StudentService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentDetailcontroller {
    @Autowired
    private StudentService studentservice;
}
