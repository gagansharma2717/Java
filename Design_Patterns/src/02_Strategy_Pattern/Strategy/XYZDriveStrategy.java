package Strategy_Pattern.Strategy;

import Strategy_Pattern.Strategy.DriveStrategy;

public class XYZDriveStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("This is XYZ Strategy");
    }
}
