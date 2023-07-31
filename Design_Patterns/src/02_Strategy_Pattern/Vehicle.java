package Strategy_Pattern;

import Strategy_Pattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy obj;

    public Vehicle(DriveStrategy obj){
        this.obj = obj;
    }

    public void drive(){
        obj.drive();
    }
}
