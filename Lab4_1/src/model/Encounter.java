/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author deepalikasture
 */
public class Encounter {
    PatientDirectory patientList = new PatientDirectory();
        Encounter e;
    
    private VitalSigns signs;
    private String TimeStamp;

    public Encounter( VitalSigns signs, String TimeStamp) {
       
        this.signs = signs;
        this.TimeStamp = TimeStamp;
    }
    
    

   

//    public Encounter(String dateOfEncounter, VitalSigns vitalSigns) {
//        this.dateOfEncounter = dateOfEncounter;
//        this.vitalSigns = vitalSigns;
//    }

    public VitalSigns getVitalSigns() {
        return signs;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.signs = vitalSigns;
    }

    public String getDateOfEncounter() {
        return TimeStamp;
    }

    public void setDateOfEncounter(String dateOfEncounter) {
        this.TimeStamp = dateOfEncounter;
    }
   

    

    public Boolean isVitalSignAbNormalBP(Encounter r) {
        if(r.getVitalSigns().getBloodPressure() <= 20  || r.getVitalSigns().getBloodPressure() >= 80)
        {
        return true;
        }
        else{
        return false;
        }
   
    } 
    public Boolean isVitalSignAbNormalHR(Encounter r) {
        if(r.getVitalSigns().getHR()<= 60  || r.getVitalSigns().getHR() >= 100)
        {
        return true;
        }
        else{
        return false;
        }
    }
    public Boolean isVitalSignAbNormalRespiration(Encounter r) {
        if(r.getVitalSigns().getRespiratoryRate()<= 90  || r.getVitalSigns().getRespiratoryRate() >= 100)
        {
        return true;
        }
        else{
        return false;
        }
   
    } 
     public Boolean isVitalSignAbNormalBT(Encounter r) {
        if(r.getVitalSigns().getTemperature()<= 98 || r.getVitalSigns().getTemperature() >= 105)
        {
        return true;
        }
        else{
        return false;
        }
   
    }
     
     public boolean isPatientNormal() {

        return false;
    }
}
