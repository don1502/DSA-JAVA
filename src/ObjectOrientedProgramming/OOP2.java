package ObjectOrientedProgramming;

import static ObjectOrientedProgramming.OOP2demonstration.greeting;

// import keyword is used to import a external method into our working class.
// Using this me can access the external method from here and use it in our class.

public class OOP2 {
    public static void main(String[] args) { // Why here it is static?
        // main is the first to execute in program when it runs, and if it should run in a class
        // we know that if we want to use the class we have to create a object of the class
        // main is the one execute, if we want to create object we must the run the object to create it
        // without main function we cannot create an object so we make main function as static.


        greeting();
        System.out.println("This is Don Gomez");

        Human don = new Human("Don Gomez", 20, 'm', false);
        System.out.println(don.population); // Here the population is static so we call it from the Human.java file
                                            // which contains Human population.
        Human abi = new Human("Abishek", 21, 'm', false);
        System.out.println(Human.population); // Here we can use object name abi also like above,
                                              // but it is more conventional and error free using the object itself ---> Human

        // population is independent of object variable i.e, population is independent of don or abi
        // population can be accessed directly by class and not by object

        System.out.println(Human.population); // Accessing population without object reference like don or abi
        // This is the use of static variable.

        OOP2 obje = new OOP2();
        obje.message();
        // This is how we can access non-static method

    }

    void message(){ // non-static methods are not called by main function
        System.out.println("Abi is gay");
    }

}

