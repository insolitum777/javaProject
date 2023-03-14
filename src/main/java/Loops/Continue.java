package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        for (int i =1;i<= 10; i++){

            if (i == 5){
                continue;
            }
            System.out.println(i);
        }

        for (int i =1; i<=100; i++){
            if (i % 2==0){
                continue;
            }
            System.out.println(i);
        }

        for (int a =1; a<=100;a++){
            if ( a%3 ==0){
                continue;
            }
            System.out.println(a);
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Enter one negative and one positive numbers");
        int negative = scanner1.nextInt();
        int positive = scanner1.nextInt();

        for (int q = negative; q<=positive; q++){
            if (q < 0 && q % 2 == 0){
                continue;

            } else if (q > 0 && q % 2 != 0){
                continue;
            }
            System.out.println(q);


        }


    }
}
