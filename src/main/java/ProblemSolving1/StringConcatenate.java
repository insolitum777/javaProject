package ProblemSolving1;

import java.util.Scanner;

public class StringConcatenate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two words");

        String word1 = scanner.nextLine();
        String word2 = scanner.next();
        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();

        System.out.println(word1.substring(word1.length()-2)+word2.substring(word2.length()-2));


        System.out.println(word1.toUpperCase().charAt(word1.length()-2)+" " +word1.toLowerCase().charAt(word1.length()-1));














    }
}
