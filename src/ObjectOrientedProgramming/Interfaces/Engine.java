package ObjectOrientedProgramming.Interfaces;

public interface Engine {

    static final int PRICE = 700000; // variables are static and final by default, that is why it is blured.

    void start();
    void stop();
    void acc();
}
