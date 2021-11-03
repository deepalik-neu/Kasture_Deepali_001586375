/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deepalikasture
 */
public class PatientDirectory {
   
 private ArrayList<Patient> patientList;
    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

   
 public void deletePatient(Patient patient) {
        patientList.remove(patient);
    }
   
    
    
    public Patient addPatient(Patient patient) {
        patientList.add(patient);
        return patient;
    }
    
   
    
    public Patient searchPatient(String patientName) {
        for(Patient patient : patientList) {
            if(patient.getName().equalsIgnoreCase(patientName)) {
                return patient;
            }
        }
        return null;
    }  
    
    
}
