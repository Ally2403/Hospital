/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class Ward {
    private int id;
    private ArrayList<Patient> patients;

    public Ward(int id) {
        this.id = id;
        this.patients = new ArrayList<>();
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
