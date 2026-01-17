
package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.ClinicDAO;
import com.edutech.progressive.entity.Clinic;
import com.edutech.progressive.service.ClinicService;

import java.util.List;

public class ClinicServiceImplJdbc implements ClinicService {
    public List<Clinic> getAllClinics(){
        return null;
    }             // Returns an empty list of clinics.

public Clinic getClinicById(int clinicId){
    return null;
}      // Returns null for a given clinic ID.

public Integer addClinic(Clinic clinic){
    return -1;
}        // Returns -1, no clinic is actually added.

public void updateClinic(Clinic clinic)
{

}       // Does nothing (method body is empty).

public void deleteClinic(int clinicId)
{
    
}    // Does nothing (method body is empty).
}