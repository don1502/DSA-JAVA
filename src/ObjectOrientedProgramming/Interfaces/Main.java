package ObjectOrientedProgramming.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.acc();
        car.brake();

        // As media and car engine has start and stop and if we run the media then it will be like
        // if we stop the media then the car stops which is in-practical.
        // We create separate class this interface.

        CarMedia media = new CarMedia();
        media.start();
        media.stop();

    }
}
