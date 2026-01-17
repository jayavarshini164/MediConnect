
package com.edutech.progressive.service;

import com.edutech.progressive.entity.Doctor;
import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors() ;
    Integer addDoctor(Doctor doctor) ;
    List<Doctor> getDoctorSortedByExperience();
  
    void emptyArrayList() ; // only for ArrayList impl
}
