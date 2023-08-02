public class Bicycle implements Bike{
    @Override
    public void accelerate() {
        // do something
    }

    // This child class is degrading the capability of Parent class
    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no engine");
    }
}
