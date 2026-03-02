package ObjectOrientedProgramming.AbstractClass;

public class Son extends Parent{
    @Override // When we inherit from an abstract parent then the methods of the class should be overrided.
    void career(String name) {
        System.out.println("I am going to become a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " She is " + age);
    }
}
