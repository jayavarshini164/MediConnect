
package com.edutech.progressive.dao;

import com.edutech.progressive.dao.ClinicDAO;
import com.edutech.progressive.entity.Clinic;
import com.edutech.progressive.config.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClinicDAOImpl implements ClinicDAO {

    @Override
    public int addClinic(Clinic clinic) throws SQLException {
        return -1;
    }

    @Override
    public Clinic getClinicById(int clinicId) throws SQLException {
        return null;
    }

    @Override
    public void updateClinic(Clinic clinic) throws SQLException {
        
    }

    @Override
    public void deleteClinic(int clinicId) throws SQLException {
       
    }

    @Override
    public List<Clinic> getAllClinics() throws SQLException {
       return null;
    }

}