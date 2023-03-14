package scannerClass;

import java.util.Scanner;

public class inputValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 10");

        int input = scanner.nextInt();
        if (input >= 1 && input <= 10) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }






    }
}
