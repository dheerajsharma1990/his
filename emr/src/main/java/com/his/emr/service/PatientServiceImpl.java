package com.his.emr.service;

import com.his.emr.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    static List<Patient> patients = new ArrayList<Patient>(
            Arrays.asList(
                    new Patient("Daenerys"," Targaryen", "Australia"),
                    new Patient("John", "Snow", "India"),
                    new Patient("Arya", "Stark", "Netherlands"),
                    new Patient("Cersei", "Baratheon", "France")));

    @Override
    public List<Patient> getAll() {
        return patients;
    }
}
