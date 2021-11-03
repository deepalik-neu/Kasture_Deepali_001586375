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
public class Patient  extends Person{
     
   

   EncounterHistory encounterHistory;
    
    Boolean isBPAbnormal;
    Boolean isBTAbnormal;
    Boolean isPulseAbnormal;
    Boolean isRespirationAbnormal;

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Patient( EncounterHistory encounterHistory,String name, Integer patientID,Integer age, String email,City city, House house,Community community) {
        super(name, patientID, age, email,city,house,community);
        this.encounterHistory=encounterHistory;
        
    }

    public Boolean getIsBPAbnormal() {
        return isBPAbnormal;
    }

    public void setIsBPAbnormal(Boolean isBPAbnormal) {
        this.isBPAbnormal = isBPAbnormal;
    }

    public Boolean getIsBTAbnormal() {
        return isBTAbnormal;
    }

    public void setIsBTAbnormal(Boolean isBTAbnormal) {
        this.isBTAbnormal = isBTAbnormal;
    }

    public Boolean getIsPulseAbnormal() {
        return isPulseAbnormal;
    }

    public void setIsPulseAbnormal(Boolean isPulseAbnormal) {
        this.isPulseAbnormal = isPulseAbnormal;
    }

    public Boolean getIsRespirationAbnormal() {
        return isRespirationAbnormal;
    }

    public void setIsRespirationAbnormal(Boolean isRespirationAbnormal) {
        this.isRespirationAbnormal = isRespirationAbnormal;
    }
    
    
    
    

   

   
}
