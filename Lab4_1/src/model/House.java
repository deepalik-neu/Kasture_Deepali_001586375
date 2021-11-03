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
public class House {
    
    private Person person;
    private String houseNumber;

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public House(String residence) {
        this.houseNumber=residence;
          }
    @Override
    public String toString() {
        return "House{" + "person=" + person + '}';
    }

    public House(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

     

}
