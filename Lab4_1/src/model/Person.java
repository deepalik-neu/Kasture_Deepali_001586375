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
public class Person {
     private String name;
    private Integer patientID;

    private String address;
    private City city;
    private Community community;
    private House house;
    private Integer age;
    private String email;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }



    public String getAddress() {
        return address;
    }

    public void setStreetName(String streetName) {
        this.address = streetName;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
 
    
    
    
     public Person(String name, Integer patientID, Integer age, String email,City city, House house,Community community) {
        this.name = name;
        this.patientID = patientID;
        this.house = house;
        this.community = community;
        this.address = address;
        this.city = city;
        this.age = age;
        this.email = email;
    }
    
}
