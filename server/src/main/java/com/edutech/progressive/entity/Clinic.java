
package com.edutech.progressive.entity;

import java.io.Serializable;

public class Clinic implements Serializable {

    private int ClinicId;            
    private String ClinicName;       
    private String Location;         
    private int DoctorId;            
    private String ContactNumber;    
    private int EstablishedYear;    

    public Clinic() {}

    public Clinic(int clinicId, String clinicName, String location,
                  int doctorId, String contactNumber, int establishedYear) {
        this.ClinicId = clinicId;
        this.ClinicName = clinicName;
        this.Location = location;
        this.DoctorId = doctorId;
        this.ContactNumber = contactNumber;
        this.EstablishedYear = establishedYear;
    }

    // Getters
    public int getClinicId() { return ClinicId; }
    public String getClinicName() { return ClinicName; }
    public String getLocation() { return Location; }
    public int getDoctorId() { return DoctorId; }
    public String getContactNumber() { return ContactNumber; }
    public int getEstablishedYear() { return EstablishedYear; }

    // Setters
    public void setClinicId(int clinicId) { ClinicId = clinicId; }
    public void setClinicName(String clinicName) { ClinicName = clinicName; }
    public void setLocation(String location) { Location = location; }
    public void setDoctorId(int doctorId) { DoctorId = doctorId; }
    public void setContactNumber(String contactNumber) { ContactNumber = contactNumber; }
    public void setEstablishedYear(int establishedYear) { EstablishedYear = establishedYear; }

    // Specific mutator mentioned
    public void setEstablishedYearValue(int establishedYear) { this.EstablishedYear = establishedYear; }

    @Override
    public String toString() {
        return "Clinic{" +
                "ClinicId=" + ClinicId +
                ", ClinicName='" + ClinicName + '\'' +
                ", Location='" + Location + '\'' +
                ", DoctorId=" + DoctorId +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", EstablishedYear=" + EstablishedYear +
                '}';
    }
}
