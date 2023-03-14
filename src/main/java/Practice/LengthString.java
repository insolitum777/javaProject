package Practice;

import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if(str1.length()>str2.length() ){
            System.out.println(str1 + ":"+str1.length());
        } else if (str2.length()<str1.length()) {
            System.out.println(str2+":"+str2.length());

        }else{
            System.out.println(str1+ "+"+str2+":"+str1.length());
        }


    }
}
