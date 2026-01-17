
package com.edutech.progressive.dao;

import com.edutech.progressive.dao.DoctorDAO;
import com.edutech.progressive.entity.Doctor;
import com.edutech.progressive.config.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO {

    @Override
    public int addDoctor(Doctor doctor) throws SQLException {
        return -1;
    }

    @Override
    public Doctor getDoctorById(int doctorId) throws SQLException {
       return null;
    }

    @Override
    public void updateDoctor(Doctor doctor) throws SQLException {
       
    }

    @Override
    public void deleteDoctor(int doctorId) throws SQLException {
      
      
    }

    @Override
    public List<Doctor> getAllDoctors() throws SQLException {
       return null;
    }
}