package Loops;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter;
        do {
            System.out.println("Enter a string with 10 vowels");
            String word = scanner.nextLine();
             counter = 0;
            word = word.toLowerCase();
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='o'|| word.charAt(i)=='i'||word.charAt(i)=='u'){
                    counter++;
                }
            }
            System.out.println("The entered word's vowel count:"+counter);
        }while (counter!=10);
    }
}
