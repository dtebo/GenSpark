package com.example.MedicationRegistry.dao;

import com.example.MedicationRegistry.entity.Medication;

import java.util.List;

public interface MedicationDAO {
    List<Medication> findAll();
    Object findById(int id);
    void saveOrUpdate(Medication theMedication);
    void deleteById(int id);
}
