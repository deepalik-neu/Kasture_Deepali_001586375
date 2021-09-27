/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.util.Date;

/**
 *
 * @author deepalikasture
 * * Assignment 1
 * Create and View PERSON Profile
 */
public class Person {
    
    private String Name;
    private String GeographicData;
    private Date DOB;
    private Long PhoneNumber;
    private String FaxNumber;
    private String Email;
    private String SSN;
    private String MedicalNumber;
    private String HealthPlanNumber;
    private String BankAccountNumber;
    private String CertificateNumber;
    private String VehicleID;
    private String DeviceID;
    private String LinkedIn;
    private String IPAdress;
    private String UniqueID;
    private File image;

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGeographicData() {
        return GeographicData;
    }

    public void setGeographicData(String GeographicData) {
        this.GeographicData = GeographicData;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getFaxNumber() {
        return FaxNumber;
    }

    public void setFaxNumber(String FaxNumber) {
        this.FaxNumber = FaxNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getMedicalNumber() {
        return MedicalNumber;
    }

    public void setMedicalNumber(String MedicalNumber) {
        this.MedicalNumber = MedicalNumber;
    }

    public String getHealthPlanNumber() {
        return HealthPlanNumber;
    }

    public void setHealthPlanNumber(String HealthPlanNumber) {
        this.HealthPlanNumber = HealthPlanNumber;
    }

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public String getCertificateNumber() {
        return CertificateNumber;
    }

    public void setCertificateNumber(String CertificateNumber) {
        this.CertificateNumber = CertificateNumber;
    }

    public String getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(String VehicleID) {
        this.VehicleID = VehicleID;
    }

    public String getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(String DeviceID) {
        this.DeviceID = DeviceID;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getIPAdress() {
        return IPAdress;
    }

    public void setIPAdress(String IPAdress) {
        this.IPAdress = IPAdress;
    }

    public String getUniqueID() {
        return UniqueID;
    }

    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }
    
}
