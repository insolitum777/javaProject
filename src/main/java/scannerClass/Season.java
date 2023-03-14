package scannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner season = new Scanner(System.in);
        System.out.println("Enter the name of the month:");
        String month = season.next();


        if (month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")||month.equalsIgnoreCase("december")){
            System.out.println("winter");

        }
    }
}
