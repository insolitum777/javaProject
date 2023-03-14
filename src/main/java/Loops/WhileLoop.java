package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i ++;
            //============================

        }//====================
        int b =1;
        while (b<=10){
            b++;
            System.out.println("Good morning everyone");
        }
        //==============================

        int num =100;
        while (num>=1){
            if ( num % 2 != 0){
                System.out.println(num);
            }
            num--;
        }


        int c = 1;
        while (c<=31){
            System.out.println(c+" January 2023");
            c++;

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean isPrime =true;
        int number = scanner.nextInt();
        int iterator =2;
        while (iterator<=number){
            if (number % iterator==0){
                isPrime =false;
            }iterator++;
        }
        if (isPrime){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }

    }
}
