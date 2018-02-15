package com.his.emr.dao;

import com.his.emr.domain.Patient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PatientDAO {

    private final Collection<Patient> patients = new ArrayList<>();

    public void create(Patient patient) {
        this.patients.add(patient);
    }

    public Collection<Patient> getPatients() {
        return patients;
    }

    public Collection<Patient> getPatients(String firstName) {
        return patients.stream()
                .filter(patient -> patient.getFirstName().startsWith(firstName))
                .collect(Collectors.toList());
    }
}
