package Strategy_Pattern.Strategy;

import Strategy_Pattern.Strategy.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {
    public void drive(){
        System.out.println("This is special drive");
    }
}
