/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.doctor;

import core.Appoiment;
import core.Patient;
import core.Team;
import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public abstract class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList<Appoiment> appoiments;
    protected ArrayList<Patient> patients;

    public Doctor(int id, Team team) {
        this.id = id;
        this.team = team;
        this.appoiments = new ArrayList<>();
        this.patients = new ArrayList<>();
        
        this.team.addDoctor(this);
    }
    
    public void addAppoiment(Appoiment appoiment){
        if(!this.appoiments.contains(appoiment)){
            this.appoiments.add(appoiment);
        }
    }
    
    public void addPatient(Patient patient){
        if(!this.patients.contains(patient)){
            this.patients.add(patient);
        }
    }

    public int getId() {
        return id;
    }
    
}
