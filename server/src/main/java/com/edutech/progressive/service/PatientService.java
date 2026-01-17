
package com.edutech.progressive.service;

import com.edutech.progressive.entity.Patient;
import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients() ;
    Integer addPatient(Patient patient) ;
    List<Patient> getAllPatientSortedByName();
   
    void emptyArrayList() ;// Only for ArrayList impl
}
