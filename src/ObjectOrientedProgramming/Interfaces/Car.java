package ObjectOrientedProgramming.Interfaces;

public class Car implements Engine, Brake{

    // We are implementing interfaces here because multiple inheritance is not possible in java

    @Override
    public void brake() {
        System.out.println("I brake");
    }

    @Override
    public void start() {
        System.out.println("I start");
    }

    @Override
    public void stop() {
        System.out.println("I stop");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate");
    }
}
