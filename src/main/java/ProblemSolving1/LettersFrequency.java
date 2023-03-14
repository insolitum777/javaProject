package ProblemSolving1;

import java.util.Scanner;

public class LettersFrequency {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a word");
       String word = scanner.nextLine();

       for (int i = 0; i < word.length() ; i++){
           int counter = 0;
           for (int a = 0; a < word.length(); a++){
               if (word.charAt(i)==word.charAt(a)){
                   counter++;
               }

           }System.out.println(word.charAt(i)+ ":"+counter);
       }












    }
}
