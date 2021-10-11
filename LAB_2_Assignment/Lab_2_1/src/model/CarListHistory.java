/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author deepalikasture
 */
public class CarListHistory {
    private ArrayList<Car> carList;
    private Date LastUpdatedDate;

    public Date getLastUpdatedDate() {
        return LastUpdatedDate;
    }

    public void setLastUpdatedDate(Date LastUpdatedDate) {
        this.LastUpdatedDate = LastUpdatedDate;
    }
    
    public CarListHistory(){
    
        this.carList= new ArrayList<Car>();
    
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public Car addNewCar(){
        Car newCar = new Car();
        carList.add(newCar);
        return newCar;
    }
    
    public void deleteCar(Car c){
        carList.remove(c);
    }
}
