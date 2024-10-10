/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.doctor.ConsultantDoctor;
import core.doctor.Doctor;
import core.doctor.JuniorDoctor;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Allison Ruiz
 */
public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }
    
    public void relationAppoiments(){
        ArrayList<Integer> counts = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        for(Team team : this.teams){
            for(Patient patient : team.getPatients()){
                counts.add(patient.getId());
                patients.add(patient);
            }
        }
        Collections.sort(counts);
        for(Integer id : counts){
            for(Patient patient : patients){
                if(patient.getId() == id){
                    System.out.println("Patient "+patient.getId()+" has "+patient.getAppoiments().size()+" appoiments");
                    for(Appoiment appoiment : patient.getAppoiments()){
                        System.out.println("Patient "+patient.getId()+" has an appoiment with the doctor "+appoiment.getDoctor().getId());
                    }
                }
            }
        }
    }
    
    public void numberPatientsTeam(){
        for(Team team : this.teams){
            System.out.println("Team "+team.getId()+" has "+team.getPatients().size()+" patients");
        }
    }
    
    public void numberDoctorsPatient(){
        ArrayList<Integer> counts = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        for(Team team : this.teams){
            for(Patient patient : team.getPatients()){
                counts.add(patient.getId());
                patients.add(patient);
            }
        }
        Collections.sort(counts);
        for(Integer id : counts){
            for(Patient patient : patients){
                if(patient.getId() == id){
                    System.out.println("Patient "+patient.getId()+" has "+patient.getDoctors().size()+" doctors");
                }
            }
        }
    }
    
    public void assignPatientDoctor(Patient patient, int parameter){
        int doctorId = patient.getTeam().getId() + parameter;
        ArrayList<Doctor> doctors = patient.getTeam().getDoctors();
        Doctor doctor1 = null;
        for(Doctor doctor : doctors){
            if(doctor.getId() == doctorId){
                doctor1 = doctor;
            }
        }
        if(doctor1!=null){
            doctor1.addPatient(patient);
            patient.addDoctor(doctor1);
        }
    }
    
    public void assignAppoiment(Patient patient, int parameter){
        int doctorId = patient.getTeam().getId() + parameter;
        ArrayList<Doctor> doctors = patient.getTeam().getDoctors();
        Doctor doctor1 = null;
        for(Doctor doctor : doctors){
            if(doctor.getId() == doctorId){
                doctor1 = doctor;
            }
        }
        Appoiment appoiment = new Appoiment(doctor1, patient);
    }
    
    public void addPatient(Ward ward, Team team, int patientId){
        Patient patient = new Patient(patientId, team, ward);
    }
    
    public void addJuniorDoctor(Team team, int juniorDoctorId){
        JuniorDoctor juniorDoctor = new JuniorDoctor(juniorDoctorId, team);
    }
    
    public void addTeam(int teamId, int consultantDoctorId){
        Team team = new Team(teamId);
        ConsultantDoctor consultantDoctor = new ConsultantDoctor(consultantDoctorId, team);
        team.setTeamLeader(consultantDoctor);
        if(!this.teams.contains(team)){
            this.teams.add(team);
        }
    }
    
    public void addWard(int id){
        Ward ward = new Ward(id);
        if(!this.wards.contains(ward)){
            this.wards.add(ward);
        }
    }
    
    public Team getTeam(int teamId){
        Team team1 = null;
        for(Team team : this.teams){
            if(team.getId() == teamId){
                team1 = team;
            }
        }
        return team1;
    }
    
    public Ward getWard(int wardId){
        Ward ward1 = null;
        for(Ward ward : this.wards){
            if(ward.getId() == wardId){
                ward1 = ward;
            }
        }
        return ward1;
    }
    
    public Patient getPatient(int patientId){
        for(Team team : this.teams){
            for(Patient patient : team.getPatients()){
                if(patient.getId() == patientId){
                    return patient;
                }
            }
        }
        return null;
    }
}
