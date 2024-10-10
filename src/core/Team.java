/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.doctor.ConsultantDoctor;
import core.doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class Team {
    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Team(int id) {
        this.id = id;
        this.teamLeader = null;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public void addPatient(Patient patient){
        if(!this.patients.contains(patient)){
            this.patients.add(patient);
        }
    }

    public void setTeamLeader(ConsultantDoctor teamLeader) {
        this.teamLeader = teamLeader;
    }
    
    public void addDoctor(Doctor doctor){
        if(!this.doctors.contains(doctor)){
            this.doctors.add(doctor);
        }
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    
}
