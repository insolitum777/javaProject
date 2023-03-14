package Loops;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers ");
        int number = scanner.nextInt();
        int number1 = scanner.nextInt();
        int sum = number+number1;
        int limit = 45;

        for (int i = 0 ;  i <= sum;i++){
            System.out.print(i);
            if (i>=45){
                break;

            }

        }
    }
}
