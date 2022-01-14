package com.example.MedicationRegistry.service;

import com.example.MedicationRegistry.dao.MedicationDAO;
import com.example.MedicationRegistry.entity.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationServiceIMPL implements MedicationService {
    private final MedicationDAO medicationDAO;

    @Autowired
    public MedicationServiceIMPL(MedicationDAO medicationDAO){ this.medicationDAO = medicationDAO; }

    @Override
    public List<Medication> findAll() { return medicationDAO.findAll(); }

    @Override
    public Object findById(int id) { return medicationDAO.findById(id); }

    @Override
    public void saveOrUpdate(Medication theMedication) { medicationDAO.saveOrUpdate(theMedication); }

    @Override
    public void deleteById(int id){ medicationDAO.deleteById(id); }
}
