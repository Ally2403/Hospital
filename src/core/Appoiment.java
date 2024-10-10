/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.doctor.Doctor;

/**
 *
 * @author Allison Ruiz
 */
public class Appoiment {
    private Doctor doctor;
    private Patient patient;

    public Appoiment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        
        this.patient.addAppoiment(this);
        this.doctor.addAppoiment(this);
    }

    public Doctor getDoctor() {
        return doctor;
    }
    
}
