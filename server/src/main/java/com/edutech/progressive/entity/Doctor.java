
package com.edutech.progressive.entity;

import java.io.Serializable;

public class Doctor implements Serializable, Comparable<Doctor> {

    private int DoctorId;              
    private String FullName;           
    private String Specialty;          
    private String ContactNumber;      
    private String Email;             
    private int YearsOfExperience;     

    public Doctor() {}

    public Doctor(int doctorId, String fullName, String specialty,
                  String contactNumber, String email, int yearsOfExperience) {
        this.DoctorId = doctorId;
        this.FullName = fullName;
        this.Specialty = specialty;
        this.ContactNumber = contactNumber;
        this.Email = email;
        this.YearsOfExperience = yearsOfExperience;
    }

    // Getters
    public int getDoctorId() { return DoctorId; }
    public String getFullName() { return FullName; }
    public String getSpecialty() { return Specialty; }
    public String getContactNumber() { return ContactNumber; }
    public String getEmail() { return Email; }
    public int getYearsOfExperience() { return YearsOfExperience; }

    // Setters
    public void setDoctorId(int doctorId) { DoctorId = doctorId; }
    public void setFullName(String fullName) { FullName = fullName; }
    public void setSpecialty(String specialty) { Specialty = specialty; }
    public void setContactNumber(String contactNumber) { ContactNumber = contactNumber; }
    public void setEmail(String email) { Email = email; }
    public void setYearsOfExperience(int yearsOfExperience) { YearsOfExperience = yearsOfExperience; }

    // Day 2: Sort Doctors by experience (ascending)
    @Override
    public int compareTo(Doctor other) {
        if (other == null) return 1;
        return Integer.compare(this.YearsOfExperience, other.YearsOfExperience);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "DoctorId=" + DoctorId +
                ", FullName='" + FullName + '\'' +
                ", Specialty='" + Specialty + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", YearsOfExperience=" + YearsOfExperience +
                '}';
    }
}
