/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author deepalikasture
 */
public class Community {
      public String communityName;
      private ArrayList<House> houseList;
 
       public Community(){
        houseList = new ArrayList<>();
        }
      
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
   
    
    public House addHouse(House house){
        houseList.add(house);
        return house;
    }
}
