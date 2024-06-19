package OOPs.Interfaces;

public class Car implements Engine, Brake {
    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }

    @Override
    public void acc() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }

}
