package com.example.MedicationRegistry.controller;

import com.example.MedicationRegistry.entity.Medication;
import com.example.MedicationRegistry.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class MedicationController {
    private final MedicationService medicationService;

    @Autowired
    public MedicationController(@Qualifier("medicationServiceIMPL")MedicationService medicationService){ this.medicationService = medicationService; }

    @GetMapping("/retrieveAllMedications")
    public List<Medication> findAll() { return medicationService.findAll(); }

    @PostMapping("/addMedication")
    public Medication addMedication(@RequestBody Medication theMedication){
        theMedication.setId(0);

        medicationService.saveOrUpdate(theMedication);
        return theMedication;
    }

    @PutMapping("/updateMedication")
    public Medication updateMedication(@RequestBody Medication updateMedication){
        medicationService.saveOrUpdate(updateMedication);
        return updateMedication;
    }

    @DeleteMapping("/deleteMedication/{medicationId}")
    public String deleteMedication(@PathVariable int medicationId){
        medicationService.deleteById(medicationId);
        return "Deleted medication id: " + medicationId;
    }
}
