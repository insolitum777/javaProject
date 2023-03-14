package Practice;

import java.util.Scanner;

public class XandY {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc1.nextInt();


        System.out.println("Enter second number");
        int y = sc1.nextInt();

        if (x > 0 && y > 0){
            System.out.println("Both x and y are positive");
        } else if (x == 0 || y == 0) {
            System.out.println("x or y is are equals to zero");
        } else if (x < 0 && y< 0) {
            System.out.println(" Both are is negative");

        } else {
            System.out.println("One is positive , the other is negative" );
        }
    }

}
