public class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        // turn on Engine
         isEngineOn = true;
    }

    @Override
    public void accelerate() {
        // Increase speed by 10
        speed += 10;
    }
}
