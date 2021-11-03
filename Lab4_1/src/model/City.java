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
public class City {
    
       String city;
       private ArrayList<Community> communityList;
       
        public City(){
        communityList = new ArrayList<>();
    }
    public String getCityName() {
        return "Boston";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
   
    
    public Community addCommunity(Community community){
        communityList.add(community);
        return community;
    }
    
    
    
    public Community getCommunity(String community)
    {
        boolean flag =false;
    for(Community c: communityList)
    {
        
        if (c.getCommunityName().equalsIgnoreCase(community))
        {
            
        flag=true;
        return c;}
    }
    if(flag==false){
        Community c=new Community();
    return  c;}
    return null;
}
}
