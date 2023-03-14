package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number");
        int number = scanner.nextInt();

        boolean isPrime =true;

        for(int i =2; i< number; i++){
            if(number % i !=0){
                isPrime =false;
                break;

            }
        }
        if (isPrime){
            System.out.print("Its prime number");
        }else {
            System.out.print("Its not a prime number");
        }
    }
}
