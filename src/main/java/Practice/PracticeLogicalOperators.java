package Practice;

import java.util.Scanner;

public class PracticeLogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();

        if (a == true && b == false){
            System.out.println("A is true and B is false");
        } if (a == true && b == true) {
            System.out.println(" B is a true and A is false");
        } if (a == b == true ) {
            System.out.println("Both A and B are true");
        } if (a == true || b == true){
            System.out.println("Either A or B is true");
        }if (a == false == b){
            System.out.println("Both A and B are false");
        }

        //=======================================


    }

}
