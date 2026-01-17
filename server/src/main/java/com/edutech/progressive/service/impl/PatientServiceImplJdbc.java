
package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.PatientDAO;
import com.edutech.progressive.entity.Patient;
import com.edutech.progressive.service.PatientService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PatientServiceImplJdbc {
    public List<Patient> getAllPatients()
    {
        return null;
    }           // Returns an empty list of patients.

public Integer addPatient(Patient patient)
{
    return -1;
}       // Returns -1, no patient is actually added.

public List<Patient> getAllPatientSortedByName()
{
    return null;
}  // Returns an empty list, sorting not implemented.

public void updatePatient(Patient patient)
{

}     // Does nothing (method body is empty).

public void deletePatient(int patientId)
{

}          // Does nothing (method body is empty).

public Patient getPatientById(int patientId)
{
    return null;
}     // Returns null for the given patient ID.
}