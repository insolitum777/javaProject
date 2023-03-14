package strings;

import javax.swing.*;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the zip code ");
        int zpCode = scanner.nextInt();

        String zipCode = zpCode+"";
        if (zipCode.length() == 5 && !zipCode.contains("9") && !zipCode.startsWith("0")){
            System.out.println("Zip code is valid");
        }else {
            System.out.println("Zip is not valid");
        }







    }
}

