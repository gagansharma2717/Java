package Strategy_Pattern;

import Strategy_Pattern.Strategy.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle{
   OffroadVehicle(){
       super(new SpecialDriveStrategy());
   }
}

