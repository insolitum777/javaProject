package Practice;

import java.util.Scanner;

public class CompareInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter an int");

        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num>num1 && num>num2){
            System.out.println("First number is larger");
        } else if (num1<num && num1>num2) {
            System.out.println("Second number is larger");

        } else if (num2>num1 && num2 >num ) {
            System.out.println("Third number is larger");
        }else{
            System.out.println("All are equals");
        }

    }

}
