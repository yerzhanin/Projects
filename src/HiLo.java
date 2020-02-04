import java.util.Scanner;

import static java.lang.Math.random;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// Random number generation
        int theNumber = (int) (Math.random() * 10 + 1);
        //System.out.println(theNumber);
        int guess = 0;
        while (guess != theNumber) {
            System.out.println("Guess the number between 1 and 10:");
            guess = scan.nextInt();
            //System.out.println("You entered " + guess);
            if (guess > theNumber)
                System.out.println(guess + " is too big");
            else if (guess < theNumber)
                System.out.println(guess + " is too low");
            else System.out.println("You are winner");
        }
    }
}
