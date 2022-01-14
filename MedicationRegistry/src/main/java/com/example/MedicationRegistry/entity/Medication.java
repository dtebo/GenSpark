package com.example.MedicationRegistry.entity;

import javax.persistence.*;

@Entity
@Table(name = "medication")
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "medication_name")
    private String medicationName;

    @Column(name = "dose")
    private String dose;

    @Column(name = "prescribing_doctor")
    private String prescribingDoctor;

    @Column(name = "phone")
    private String phone;

    public Medication() {
    }

    public Medication(String medicationName, String dose, String prescribingDoctor, String phone) {
        this.medicationName = medicationName;
        this.dose = dose;
        this.prescribingDoctor = prescribingDoctor;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getPrescribingDoctor() {
        return prescribingDoctor;
    }

    public void setPrescribingDoctor(String prescribingDoctor) {
        this.prescribingDoctor = prescribingDoctor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "Medication{" +
                "id=" + id +
                ", medicationName=" + medicationName + '\'' +
                ", dose=" + dose + '\'' +
                ", prescribingDoctor=" + prescribingDoctor + '\'' +
                ", phone=" + phone + '\'' +
                "}";
    }
}
