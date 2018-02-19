package com.his.emr.controller;

import com.his.emr.model.Patient;
import com.his.emr.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<List<Patient>> getAll() {
        List<Patient> users = patientService.getAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
