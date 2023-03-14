package Loops;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0 ;
        do {
            System.out.println("Enter even number");
            num =scanner.nextInt();

        }while (num%2 !=0);
    }
}
