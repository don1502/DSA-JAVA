package ObjectOrientedProgramming;

public class Human{
    String name;
    int age;
    char gender;
    boolean married;
    static long population;

    public Human(String name, int age, char gender, boolean married){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        Human.population += 1;
    }

}
