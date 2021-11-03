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
public class PersonDirectory {
     private ArrayList<Person> personList;
    
    //private ArrayList<Person> history;
    public Object getPersonHistory;
   
     
    public PersonDirectory() {
        personList = new ArrayList<>();
    }

   

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    
    public Person addNewPerson(Person person) {
        personList.add(person);
        return person;
    }   
}
