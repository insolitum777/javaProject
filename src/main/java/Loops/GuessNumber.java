package Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


        int randomNumber = new Random().nextInt(1, 100);

        Scanner Sr = new Scanner(System.in);
        int num2;

        do {
            System.out.println("enter a number");
            num2 = Sr.nextInt();
            if (num2 < randomNumber) {
                System.out.println("is too low");
            } else if (num2 > randomNumber) {
                System.out.println("is too high");
            } else {
                System.out.println(" you guess the right number");
                break;
            }
        } while (num2 <= 100);
    }
}
