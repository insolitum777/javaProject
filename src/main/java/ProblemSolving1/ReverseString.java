package ProblemSolving1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String str1 = scanner.next();
        String reversed = "";

        for (int i = str1.length()-1 ; i >= 0 ; i--){
            reversed += str1.charAt(i);


        }System.out.println(reversed);





    }
}
