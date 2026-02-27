package ObjectOrientedProgramming;

// Inheritance demonstration


// ----------------------------------- Note --------------------------------------------------

// Always Should not create a file like this. This is a bullshit.
// Always create a seperate package for each and in that package make separate class files for modularity
// When you make a application never do such mistakes.

// --------------------------------------------------------------------------------------------

public class OOP3 {

    double len;
    double wid;
    double height;

    OOP3(){
        this.height = -1;
        this.len = -1;
        this.wid = -1;
    }

    OOP3(double side){
        this.height = side;
        this.len = side;
        this.wid = side;
    }

    OOP3(double len, double wid, double height){
        this.height = height;
        this.len = len;
        this.wid = wid;
    }

}

// Inherited class which extends from base class OOP3

class Box extends OOP3 {
    double weight;

    Box(){
        this.weight = -1;
    }

    Box(double weight){ // Here we don't have any value for height, width and length
                        // so we cannot give a value for them and instead it take value from parent which is -1.
        this.weight = weight;
    }
    // To avoid this, we make another constructor.

    Box(double l, double w, double h, double weight){
        super(l,w,h); // what does this do?
        // This basically say call the parent class constructor...
        // Used to initialize values present in parent class.

        this.weight = weight;
    }


}

class Main{
    public static void main(String[] args){
        OOP3 box1 = new OOP3(10,20, 30);
        OOP3 box2 = new OOP3(10);
        System.out.println(box1.len + " " + box1.wid + " " + box1.height);
        System.out.println(box2.len + " " + box2.wid + " " + box2.height);

        Box box = new Box();
        System.out.println(box.len + " " + box.wid + " " + box.height + " " + box.weight);
        // Inherited child class has parent property (length, width, height) as well as its own property (weight)

        Box smallBox = new Box(20);
        System.out.println(smallBox.len + " " + smallBox.wid + " " + smallBox.height + " " + smallBox.weight);

        Box bigBox = new Box(10, 29, 39, 10);
        System.out.println(bigBox.len + " " + bigBox.wid + " " + bigBox.height + " " + bigBox.weight);

    }
}
