package BitManipulation;

import java.util.Scanner;

public class powersInBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // This is the main loop that is used to find the powered number...

        int answer = 1;
        while(power > 0){
            if((power & 1) == 1){
                answer = answer * n;
            }
            n = n * n;
            power = power >> 1;
        }
        System.out.print("The powered number for given number and power is " + answer);
    }
}
