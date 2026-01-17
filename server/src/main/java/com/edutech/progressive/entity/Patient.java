
package com.edutech.progressive.entity;

import java.util.Date;

// import java.sql.Date;

public class Patient implements Comparable<Patient> {

    private int PatientId;           // Unique ID for the patient
    private String FullName;         // Full name
    private Date DateOfBirth;        // Date of birth
    private String ContactNumber;    // Phone
    private String Email;            // Email address
    private String Address;          // Residential address

    public Patient() {}

    public Patient(int patientId, String fullName, Date dateOfBirth,
                   String contactNumber, String email, String address) {
        this.PatientId = patientId;
        this.FullName = fullName;
        this.DateOfBirth = dateOfBirth;
        this.ContactNumber = contactNumber;
        this.Email = email;
        this.Address = address;
    }

    // Getters
    public int getPatientId() { return PatientId; }
    public String getFullName() { return FullName; }
    public Date getDateOfBirth() { return DateOfBirth; }
    public String getContactNumber() { return ContactNumber; }
    public String getEmail() { return Email; }
    public String getAddress() { return Address; }

    // Setters
    public void setPatientId(int patientId) { PatientId = patientId; }
    public void setFullName(String fullName) { FullName = fullName; }
    public void setDateOfBirth(Date dateOfBirth) { DateOfBirth = dateOfBirth; }
    public void setContactNumber(String contactNumber) { ContactNumber = contactNumber; }
    public void setEmail(String email) { Email = email; }
    public void setAddress(String address) { Address = address; }

    // Day 2: Sort Patients by name (ascending)
    @Override
    public int compareTo(Patient other) {
        
        return this.FullName.compareToIgnoreCase(other.FullName);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "PatientId=" + PatientId +
                ", FullName='" + FullName + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
