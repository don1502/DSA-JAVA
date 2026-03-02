package ObjectOrientedProgramming.Interfaces;

public class CarMedia implements Media{

    @Override
    public void start() {
        System.out.println("I start media");
    }

    @Override
    public void stop() {
        System.out.println("I stop media");
    }

}
