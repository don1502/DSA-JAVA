package ObjectOrientedProgramming;

// Refer notes for good detailed explaination


public class classesInOOP {
    public static void main(String[] args) {

        Student don = new Student(); // Using class with declared instance === "don"

        // Using the object instance of the class Student
        don.name = "DON";
        don.rollNo = 7;
        don.mark = 88.5f;// For float always put 'f' in the last of the value...
        System.out.println(don.mark);
        System.out.println(don.name);
        System.out.println(don.rollNo);
    }
}
// Creating a class which is used as a custom data type

// This class acts as a constructor class...

class Student{ // class name should always be Upper "Student" 'S' should be always capital

    // Class student is the custom data type which is used to store multiple data type to make common datatype - student

    int rollNo;
    String name;
    float mark;

    Student(){ // This is a constructor, It is a template for the class Student and it is ran when it is called

        this.mark = mark;
        this.name = name;
        this.rollNo = rollNo;

    }

}  


// Student() ----> Is the constructor of this class, what constructor do is
// basically constructor define what happens when the object is created