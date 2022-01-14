package com.example.MedicationRegistry.service;

import com.example.MedicationRegistry.entity.Medication;

import java.util.List;

public interface MedicationService {
    List<Medication> findAll();
    Object findById(int id);
    void saveOrUpdate(Medication theMedication);
    void deleteById(int id);
}
