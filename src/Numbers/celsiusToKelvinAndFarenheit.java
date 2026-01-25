package Numbers;

// https://leetcode.com/problems/convert-the-temperature
// Leetcode problem 2469. Convert the Temperature

import java.util.Scanner;

public class celsiusToKelvinAndFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = input.nextDouble();

        System.out.println("The temperature transfer from celsius to kelvin and farenheit is " + convertTemperature(n));
    }

    //Kelvin = Celsius + 273.15
    //Fahrenheit = Celsius * 1.80 + 32.00

    // Main leetcode function....

    static double[] convertTemperature(double celsius) {
        double [] arr = new double[2];
        arr[0] = celsius + 273.15;
        arr[1] = celsius * 1.80 + 32;
        return arr;
    }

}
