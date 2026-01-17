
package com.edutech.progressive.dao;

import com.edutech.progressive.dao.PatientDAO;
import com.edutech.progressive.entity.Patient;
import com.edutech.progressive.config.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {

    @Override
    public int addPatient(Patient patient) throws SQLException {
      return -1;

    }

    @Override
    public Patient getPatientById(int patientId) throws SQLException {
        return null;
    }

    @Override
    public void updatePatient(Patient patient) throws SQLException {
       
    }

    @Override
    public void deletePatient(int patientId) throws SQLException {
       
    }

    @Override
    public List<Patient> getAllPatients() throws SQLException {
        return null;
    }

}