package Practice;

import java.util.Scanner;

public class StrToLowerCAse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");

        String str = scanner.nextLine();
        System.out.println(str.toLowerCase());

    }
}
