package ObjectOrientedProgramming.Polymorphism;

// Polymorphism

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.area();
        square.area();
        shape.area();

        // Second type of polymorphism is "RUNTIME/DYNAMIC POLYMORPHISM" which is achieved by method overriding
        // It is that when a child class has the same method of parent class then when it is called child class executes
        // This is done by overriding parent class

        // Here Shapes is the parent class and has method ------> void area()
        // And all the child class also has same method -------> void area()
        // So this is runtime/dynamic polymorphism

        // Whenever child object is created child method is given priority than parent method
        // In this we directly did overriding by creating same method for child
        // but in usecase we use annotation "@Override" for overriding

        Shapes n = new Circle(); // The reference variable is parent class but the object variable is child class
                                 // So what happens is when method is called parent method is override by child class.
        n.area(); // Parent method is overriden child method

    }
}
