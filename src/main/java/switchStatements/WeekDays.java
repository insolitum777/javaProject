package switchStatements;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {

        int day = 5;
        switch (day){
            case 1,2,3,4,5:
                System.out.println("Weekday");
                break;
            case 6,7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }


        //=================================

        char letter ='a';

        switch (letter){
            case 'a','e','i','o','u':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Consonant");

        }
//==============================================

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");

        char grade = sc.nextLine().charAt(0);



        switch (grade){
            case 'A':
                System.out.println("Perfect");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Better than yesterday");
                break;
            case 'F':
                System.out.println("Not a good job");
                break;
            default:
                System.out.println("Invalid");


        }




    }
}
